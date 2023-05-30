package xom.nt.bo;

public class CustomerBO {
	//Bean properties
		private String cusName;
		private String cusAddres;
		private Float pamt;
		private Float rate;
		private Float time;
		private Float InserstAmt;
		
		public String getCusName() {
			return cusName;
		}
		public void setCusName(String cusName) {
			this.cusName = cusName;
		}
		public String getCusAddres() {
			return cusAddres;
		}
		public void setCusAddres(String susAddres) {
			this.cusAddres = susAddres;
		}
		public Float getPamt() {
			return pamt;
		}
		public void setPamt(Float pamt) {
			this.pamt = pamt;
		}
		public Float getRate() {
			return rate;
		}
		public void setRate(Float rate) {
			this.rate = rate;
		}
		public Float getTime() {
			return time;
		}
		public void setTime(Float time) {
			this.time = time;
		}
		public Float getInserstAmt() {
			return InserstAmt;
		}
		public void setInserstAmt(Float inserstAmt) {
			InserstAmt = inserstAmt;
		}
		@Override
		public String toString() {
			return "CustomerBO [cusName=" + cusName + ", cusAddres=" + cusAddres + ", pamt=" + pamt + ", rate=" + rate
					+ ", time=" + time + ", InserstAmt=" + InserstAmt + "]";
		}
		
		
		 
}
