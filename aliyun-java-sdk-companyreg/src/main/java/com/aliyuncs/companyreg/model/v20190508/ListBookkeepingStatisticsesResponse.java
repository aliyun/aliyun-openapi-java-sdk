/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.companyreg.model.v20190508;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20190508.ListBookkeepingStatisticsesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBookkeepingStatisticsesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private Float incomeSum;

	private Float expendSum;

	private Float profitSum;

	private Float taxAmountSum;

	private List<BookkeepingStatistics> bookkeepingStatisticses;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Float getIncomeSum() {
		return this.incomeSum;
	}

	public void setIncomeSum(Float incomeSum) {
		this.incomeSum = incomeSum;
	}

	public Float getExpendSum() {
		return this.expendSum;
	}

	public void setExpendSum(Float expendSum) {
		this.expendSum = expendSum;
	}

	public Float getProfitSum() {
		return this.profitSum;
	}

	public void setProfitSum(Float profitSum) {
		this.profitSum = profitSum;
	}

	public Float getTaxAmountSum() {
		return this.taxAmountSum;
	}

	public void setTaxAmountSum(Float taxAmountSum) {
		this.taxAmountSum = taxAmountSum;
	}

	public List<BookkeepingStatistics> getBookkeepingStatisticses() {
		return this.bookkeepingStatisticses;
	}

	public void setBookkeepingStatisticses(List<BookkeepingStatistics> bookkeepingStatisticses) {
		this.bookkeepingStatisticses = bookkeepingStatisticses;
	}

	public static class BookkeepingStatistics {

		private String produceBizId;

		private Integer year;

		private Integer month;

		private Float income;

		private Float expend;

		private Float profit;

		private Float taxAmount;

		private Float taxZzs;

		private Float taxFjs;

		private Float taxQysds;

		private Float taxYhs;

		private Float taxGhjf;

		private Float taxSljj;

		private Float taxCjrbzj;

		private Float taxOther;

		private String taxAmountNote;

		private String taxZzsNote;

		private String taxFjsNote;

		private String taxQysdsNote;

		private String taxYhsNote;

		private String taxGhjfNote;

		private String taxSljjNote;

		private String taxCjrbzjNote;

		private String taxOtherNote;

		private Integer voucherCount;

		private Integer subjectCount;

		private List<TaxDetail> taxDetails;

		public String getProduceBizId() {
			return this.produceBizId;
		}

		public void setProduceBizId(String produceBizId) {
			this.produceBizId = produceBizId;
		}

		public Integer getYear() {
			return this.year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}

		public Integer getMonth() {
			return this.month;
		}

		public void setMonth(Integer month) {
			this.month = month;
		}

		public Float getIncome() {
			return this.income;
		}

		public void setIncome(Float income) {
			this.income = income;
		}

		public Float getExpend() {
			return this.expend;
		}

		public void setExpend(Float expend) {
			this.expend = expend;
		}

		public Float getProfit() {
			return this.profit;
		}

		public void setProfit(Float profit) {
			this.profit = profit;
		}

		public Float getTaxAmount() {
			return this.taxAmount;
		}

		public void setTaxAmount(Float taxAmount) {
			this.taxAmount = taxAmount;
		}

		public Float getTaxZzs() {
			return this.taxZzs;
		}

		public void setTaxZzs(Float taxZzs) {
			this.taxZzs = taxZzs;
		}

		public Float getTaxFjs() {
			return this.taxFjs;
		}

		public void setTaxFjs(Float taxFjs) {
			this.taxFjs = taxFjs;
		}

		public Float getTaxQysds() {
			return this.taxQysds;
		}

		public void setTaxQysds(Float taxQysds) {
			this.taxQysds = taxQysds;
		}

		public Float getTaxYhs() {
			return this.taxYhs;
		}

		public void setTaxYhs(Float taxYhs) {
			this.taxYhs = taxYhs;
		}

		public Float getTaxGhjf() {
			return this.taxGhjf;
		}

		public void setTaxGhjf(Float taxGhjf) {
			this.taxGhjf = taxGhjf;
		}

		public Float getTaxSljj() {
			return this.taxSljj;
		}

		public void setTaxSljj(Float taxSljj) {
			this.taxSljj = taxSljj;
		}

		public Float getTaxCjrbzj() {
			return this.taxCjrbzj;
		}

		public void setTaxCjrbzj(Float taxCjrbzj) {
			this.taxCjrbzj = taxCjrbzj;
		}

		public Float getTaxOther() {
			return this.taxOther;
		}

		public void setTaxOther(Float taxOther) {
			this.taxOther = taxOther;
		}

		public String getTaxAmountNote() {
			return this.taxAmountNote;
		}

		public void setTaxAmountNote(String taxAmountNote) {
			this.taxAmountNote = taxAmountNote;
		}

		public String getTaxZzsNote() {
			return this.taxZzsNote;
		}

		public void setTaxZzsNote(String taxZzsNote) {
			this.taxZzsNote = taxZzsNote;
		}

		public String getTaxFjsNote() {
			return this.taxFjsNote;
		}

		public void setTaxFjsNote(String taxFjsNote) {
			this.taxFjsNote = taxFjsNote;
		}

		public String getTaxQysdsNote() {
			return this.taxQysdsNote;
		}

		public void setTaxQysdsNote(String taxQysdsNote) {
			this.taxQysdsNote = taxQysdsNote;
		}

		public String getTaxYhsNote() {
			return this.taxYhsNote;
		}

		public void setTaxYhsNote(String taxYhsNote) {
			this.taxYhsNote = taxYhsNote;
		}

		public String getTaxGhjfNote() {
			return this.taxGhjfNote;
		}

		public void setTaxGhjfNote(String taxGhjfNote) {
			this.taxGhjfNote = taxGhjfNote;
		}

		public String getTaxSljjNote() {
			return this.taxSljjNote;
		}

		public void setTaxSljjNote(String taxSljjNote) {
			this.taxSljjNote = taxSljjNote;
		}

		public String getTaxCjrbzjNote() {
			return this.taxCjrbzjNote;
		}

		public void setTaxCjrbzjNote(String taxCjrbzjNote) {
			this.taxCjrbzjNote = taxCjrbzjNote;
		}

		public String getTaxOtherNote() {
			return this.taxOtherNote;
		}

		public void setTaxOtherNote(String taxOtherNote) {
			this.taxOtherNote = taxOtherNote;
		}

		public Integer getVoucherCount() {
			return this.voucherCount;
		}

		public void setVoucherCount(Integer voucherCount) {
			this.voucherCount = voucherCount;
		}

		public Integer getSubjectCount() {
			return this.subjectCount;
		}

		public void setSubjectCount(Integer subjectCount) {
			this.subjectCount = subjectCount;
		}

		public List<TaxDetail> getTaxDetails() {
			return this.taxDetails;
		}

		public void setTaxDetails(List<TaxDetail> taxDetails) {
			this.taxDetails = taxDetails;
		}

		public static class TaxDetail {

			private String taxName;

			private Integer year;

			private Integer month;

			private Float amount;

			private String remark;

			public String getTaxName() {
				return this.taxName;
			}

			public void setTaxName(String taxName) {
				this.taxName = taxName;
			}

			public Integer getYear() {
				return this.year;
			}

			public void setYear(Integer year) {
				this.year = year;
			}

			public Integer getMonth() {
				return this.month;
			}

			public void setMonth(Integer month) {
				this.month = month;
			}

			public Float getAmount() {
				return this.amount;
			}

			public void setAmount(Float amount) {
				this.amount = amount;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}
		}
	}

	@Override
	public ListBookkeepingStatisticsesResponse getInstance(UnmarshallerContext context) {
		return	ListBookkeepingStatisticsesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
