static int mexOn(int arr[], int x) {
		int dp[] = new int[100000];
		int  ans=0;
		for(int i=0; i<arr.length; i++) {
			dp[arr[i]%x]++;
			while(dp[ans%x] != 0) {
				dp[ans%x]--;
				ans++;
			}
		}
		return ans;
	}
