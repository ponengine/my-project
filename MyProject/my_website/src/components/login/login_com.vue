<template>
  <div class="login_com">
    <form v-on:submit.prevent="getToken()" method="post">
      <p>
        <label for="">
          Username :
        </label>
        <input
          type="text"
          name=""
          id=""
          placeholder="example@mail.com"
          v-model="loginobj.username"
        />
      </p>
      <p>
        <label for="">
          Password :
        </label>
        <input type="password" name="" id="" v-model="loginobj.password" />
      </p>
      <button type="submit"  >Login</button>
    </form>
    spy:{{ loginobj }}
  </div>
</template>

<script>
import { HTTP_TOKEN } from "@/http/http-common"
export default {
  name: "Login_Com",
  data() {
    return {
      loginobj: {
        username: "",
        password: "",
      },
    };
  },
  methods: {
    getToken: function() {
      HTTP_TOKEN.post("login", this.loginobj)
        .then((response) => {this.articleId = response.data.id})
        .catch((error) => {
          this.errorMessage = error.message;
          console.error("There was an error!", error);
        });
    },
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
