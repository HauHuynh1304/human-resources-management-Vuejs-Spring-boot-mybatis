const passwordRegex = new RegExp(
  /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$/
);

const emailRegex = new RegExp(
  /^[A-Za-z0-9]+(\.[A-Za-z0-9]+)*\@[A-Za-z0-9]+(\.[A-Za-z0-9]+)*/
);

const numberRegex = new RegExp(/^\d+/);

export function isValidPassword(string) {
  return passwordRegex.test(string);
}

export function isValidEmail(string) {
  return emailRegex.test(string);
}

export function isValidNumber(String) {
  return numberRegex.test(String);
}
