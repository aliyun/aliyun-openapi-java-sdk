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

package com.aliyuncs.companyreg.model.v20201022;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20201022.GetFeeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFeeResponse extends AcsResponse {

	private Boolean canUpdate;

	private String payer;

	private String requestId;

	private Long createdStamp;

	private String acctgPeriod;

	private String url;

	private String baseTotalTax;

	private String baseTotalAmount;

	private String labelData;

	private Long id;

	private String baseTotalAmountWithoutTax;

	private List<AcctgTransList> voucherTransList;

	private FeeTypeEnum feeTypeEnum;

	private Kind kind;

	private PayMethod payMethod;

	private Use use;

	public Boolean getCanUpdate() {
		return this.canUpdate;
	}

	public void setCanUpdate(Boolean canUpdate) {
		this.canUpdate = canUpdate;
	}

	public String getPayer() {
		return this.payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCreatedStamp() {
		return this.createdStamp;
	}

	public void setCreatedStamp(Long createdStamp) {
		this.createdStamp = createdStamp;
	}

	public String getAcctgPeriod() {
		return this.acctgPeriod;
	}

	public void setAcctgPeriod(String acctgPeriod) {
		this.acctgPeriod = acctgPeriod;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBaseTotalTax() {
		return this.baseTotalTax;
	}

	public void setBaseTotalTax(String baseTotalTax) {
		this.baseTotalTax = baseTotalTax;
	}

	public String getBaseTotalAmount() {
		return this.baseTotalAmount;
	}

	public void setBaseTotalAmount(String baseTotalAmount) {
		this.baseTotalAmount = baseTotalAmount;
	}

	public String getLabelData() {
		return this.labelData;
	}

	public void setLabelData(String labelData) {
		this.labelData = labelData;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBaseTotalAmountWithoutTax() {
		return this.baseTotalAmountWithoutTax;
	}

	public void setBaseTotalAmountWithoutTax(String baseTotalAmountWithoutTax) {
		this.baseTotalAmountWithoutTax = baseTotalAmountWithoutTax;
	}

	public List<AcctgTransList> getVoucherTransList() {
		return this.voucherTransList;
	}

	public void setVoucherTransList(List<AcctgTransList> voucherTransList) {
		this.voucherTransList = voucherTransList;
	}

	public FeeTypeEnum getFeeTypeEnum() {
		return this.feeTypeEnum;
	}

	public void setFeeTypeEnum(FeeTypeEnum feeTypeEnum) {
		this.feeTypeEnum = feeTypeEnum;
	}

	public Kind getKind() {
		return this.kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}

	public PayMethod getPayMethod() {
		return this.payMethod;
	}

	public void setPayMethod(PayMethod payMethod) {
		this.payMethod = payMethod;
	}

	public Use getUse() {
		return this.use;
	}

	public void setUse(Use use) {
		this.use = use;
	}

	public static class AcctgTransList {

		private VoucherTransId voucherTransId;

		public VoucherTransId getVoucherTransId() {
			return this.voucherTransId;
		}

		public void setVoucherTransId(VoucherTransId voucherTransId) {
			this.voucherTransId = voucherTransId;
		}

		public static class VoucherTransId {

			private String refVoucherIds;

			private Long id;

			public String getRefVoucherIds() {
				return this.refVoucherIds;
			}

			public void setRefVoucherIds(String refVoucherIds) {
				this.refVoucherIds = refVoucherIds;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}
	}

	public static class FeeTypeEnum {

		private String label;

		private String value;

		public String getLabel() {
			return this.label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class Kind {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class PayMethod {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class Use {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public GetFeeResponse getInstance(UnmarshallerContext context) {
		return	GetFeeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
