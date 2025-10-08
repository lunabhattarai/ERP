let count = 0;
document.getElementById("clickBtn").addEventListener("click", function() {
  count++;
  document.getElementById("count").textContent = count;
});
