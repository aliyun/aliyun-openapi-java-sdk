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
import com.aliyuncs.companyreg.transform.v20201022.GetInvoiceInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInvoiceInfoResponse extends AcsResponse {

	private String acctgPeriod;

	private String baseTotalAmountWithTax;

	private String baseTotalAmountWithoutTax;

	private String baseTotalTax;

	private Long bizDate;

	private String comments;

	private Long createdStamp;

	private Long dueDate;

	private String elecInvoiceUrl;

	private Long id;

	private String invoiceCode;

	private String invoiceNo;

	private Boolean isElectronic;

	private Boolean isAuth;

	private Boolean isFee;

	private String orgName;

	private String requestId;

	private Boolean simulationCertified;

	private String taxNo;

	private String taxPct;

	private String type;

	private String payer;

	private Boolean canUpdate;

	private String labelData;

	private List<DetailsItem> details;

	private List<AcctgTransList> voucherTransList;

	private BuyMethod buyMethod;

	private BuyTarget buyTarget;

	private CustVendorId custVendorId;

	private FixedAssetType fixedAssetType;

	private IncomeOutType incomeOutType;

	private Kind kind;

	private PayMethod payMethod;

	private ShellMethod shellMethod;

	private Use use;

	public String getAcctgPeriod() {
		return this.acctgPeriod;
	}

	public void setAcctgPeriod(String acctgPeriod) {
		this.acctgPeriod = acctgPeriod;
	}

	public String getBaseTotalAmountWithTax() {
		return this.baseTotalAmountWithTax;
	}

	public void setBaseTotalAmountWithTax(String baseTotalAmountWithTax) {
		this.baseTotalAmountWithTax = baseTotalAmountWithTax;
	}

	public String getBaseTotalAmountWithoutTax() {
		return this.baseTotalAmountWithoutTax;
	}

	public void setBaseTotalAmountWithoutTax(String baseTotalAmountWithoutTax) {
		this.baseTotalAmountWithoutTax = baseTotalAmountWithoutTax;
	}

	public String getBaseTotalTax() {
		return this.baseTotalTax;
	}

	public void setBaseTotalTax(String baseTotalTax) {
		this.baseTotalTax = baseTotalTax;
	}

	public Long getBizDate() {
		return this.bizDate;
	}

	public void setBizDate(Long bizDate) {
		this.bizDate = bizDate;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Long getCreatedStamp() {
		return this.createdStamp;
	}

	public void setCreatedStamp(Long createdStamp) {
		this.createdStamp = createdStamp;
	}

	public Long getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Long dueDate) {
		this.dueDate = dueDate;
	}

	public String getElecInvoiceUrl() {
		return this.elecInvoiceUrl;
	}

	public void setElecInvoiceUrl(String elecInvoiceUrl) {
		this.elecInvoiceUrl = elecInvoiceUrl;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInvoiceCode() {
		return this.invoiceCode;
	}

	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public Boolean getIsElectronic() {
		return this.isElectronic;
	}

	public void setIsElectronic(Boolean isElectronic) {
		this.isElectronic = isElectronic;
	}

	public Boolean getIsAuth() {
		return this.isAuth;
	}

	public void setIsAuth(Boolean isAuth) {
		this.isAuth = isAuth;
	}

	public Boolean getIsFee() {
		return this.isFee;
	}

	public void setIsFee(Boolean isFee) {
		this.isFee = isFee;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSimulationCertified() {
		return this.simulationCertified;
	}

	public void setSimulationCertified(Boolean simulationCertified) {
		this.simulationCertified = simulationCertified;
	}

	public String getTaxNo() {
		return this.taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getTaxPct() {
		return this.taxPct;
	}

	public void setTaxPct(String taxPct) {
		this.taxPct = taxPct;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPayer() {
		return this.payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public Boolean getCanUpdate() {
		return this.canUpdate;
	}

	public void setCanUpdate(Boolean canUpdate) {
		this.canUpdate = canUpdate;
	}

	public String getLabelData() {
		return this.labelData;
	}

	public void setLabelData(String labelData) {
		this.labelData = labelData;
	}

	public List<DetailsItem> getDetails() {
		return this.details;
	}

	public void setDetails(List<DetailsItem> details) {
		this.details = details;
	}

	public List<AcctgTransList> getVoucherTransList() {
		return this.voucherTransList;
	}

	public void setVoucherTransList(List<AcctgTransList> voucherTransList) {
		this.voucherTransList = voucherTransList;
	}

	public BuyMethod getBuyMethod() {
		return this.buyMethod;
	}

	public void setBuyMethod(BuyMethod buyMethod) {
		this.buyMethod = buyMethod;
	}

	public BuyTarget getBuyTarget() {
		return this.buyTarget;
	}

	public void setBuyTarget(BuyTarget buyTarget) {
		this.buyTarget = buyTarget;
	}

	public CustVendorId getCustVendorId() {
		return this.custVendorId;
	}

	public void setCustVendorId(CustVendorId custVendorId) {
		this.custVendorId = custVendorId;
	}

	public FixedAssetType getFixedAssetType() {
		return this.fixedAssetType;
	}

	public void setFixedAssetType(FixedAssetType fixedAssetType) {
		this.fixedAssetType = fixedAssetType;
	}

	public IncomeOutType getIncomeOutType() {
		return this.incomeOutType;
	}

	public void setIncomeOutType(IncomeOutType incomeOutType) {
		this.incomeOutType = incomeOutType;
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

	public ShellMethod getShellMethod() {
		return this.shellMethod;
	}

	public void setShellMethod(ShellMethod shellMethod) {
		this.shellMethod = shellMethod;
	}

	public Use getUse() {
		return this.use;
	}

	public void setUse(Use use) {
		this.use = use;
	}

	public static class DetailsItem {

		private Product product;

		public Product getProduct() {
			return this.product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		public static class Product {

			private Long id;

			private String name;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
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

			private Long id;

			private String refVoucherIds;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getRefVoucherIds() {
				return this.refVoucherIds;
			}

			public void setRefVoucherIds(String refVoucherIds) {
				this.refVoucherIds = refVoucherIds;
			}
		}
	}

	public static class BuyMethod {

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

	public static class BuyTarget {

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

	public static class CustVendorId {

		private String partyName;

		public String getPartyName() {
			return this.partyName;
		}

		public void setPartyName(String partyName) {
			this.partyName = partyName;
		}
	}

	public static class FixedAssetType {

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

	public static class IncomeOutType {

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

	public static class ShellMethod {

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
	public GetInvoiceInfoResponse getInstance(UnmarshallerContext context) {
		return	GetInvoiceInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
