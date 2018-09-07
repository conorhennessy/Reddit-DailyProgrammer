function subfactorials(n) {
    if (n == 0) return 1;
    if (n == 1) return 0;
    return (n-1) * (subfactorials(n-1) + subfactorials(n-2))
}