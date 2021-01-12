<template>
  <div class="register_com">
    <form v-on:submit.prevent="" method="post">
      <h5></h5>
      <p>
        <label for="">
          Username :
        </label>
        <input type="text" name="" id="" placeholder="example@mail.com" />
      </p>
      <p>
        <label for="">
          Password :
        </label>
        <input type="password" name="" id="" />
      </p>
      <p>
        <label for="">
          Confirm-Password :
        </label>
        <input type="password" name="" id="" />
      </p>
      <h5>Detail</h5>
      <p>
        <label for="">
          Phone Number :
        </label>
        <input type="password" name="" id="" />
      </p>
      <p>
        <label for="">
          BirthDate :
        </label>
        <input type="password" name="" id="" />
      </p>

      <button type="submit">Register</button>
    </form>
  </div>
</template>

<script>
export default {
  name: "Register_Com",
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
