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
import com.aliyuncs.companyreg.transform.v20201022.GetTypeListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTypeListResponse extends AcsResponse {

	private String requestId;

	private Fee fee;

	private InInvoice inInvoice;

	private OutInvoice outInvoice;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Fee getFee() {
		return this.fee;
	}

	public void setFee(Fee fee) {
		this.fee = fee;
	}

	public InInvoice getInInvoice() {
		return this.inInvoice;
	}

	public void setInInvoice(InInvoice inInvoice) {
		this.inInvoice = inInvoice;
	}

	public OutInvoice getOutInvoice() {
		return this.outInvoice;
	}

	public void setOutInvoice(OutInvoice outInvoice) {
		this.outInvoice = outInvoice;
	}

	public static class Fee {

		private List<KindEnum> kind;

		private List<PayMethodEnum> payMethod;

		private List<UseEnum> use;

		public List<KindEnum> getKind() {
			return this.kind;
		}

		public void setKind(List<KindEnum> kind) {
			this.kind = kind;
		}

		public List<PayMethodEnum> getPayMethod() {
			return this.payMethod;
		}

		public void setPayMethod(List<PayMethodEnum> payMethod) {
			this.payMethod = payMethod;
		}

		public List<UseEnum> getUse() {
			return this.use;
		}

		public void setUse(List<UseEnum> use) {
			this.use = use;
		}

		public static class KindEnum {

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

		public static class PayMethodEnum {

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

		public static class UseEnum {

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
	}

	public static class InInvoice {

		private List<BuyMethodEnum> buyMethod;

		private List<FixedAssetTypeEnum> fixedAssetType;

		private List<BuyTargetEnum> buyTarget;

		public List<BuyMethodEnum> getBuyMethod() {
			return this.buyMethod;
		}

		public void setBuyMethod(List<BuyMethodEnum> buyMethod) {
			this.buyMethod = buyMethod;
		}

		public List<FixedAssetTypeEnum> getFixedAssetType() {
			return this.fixedAssetType;
		}

		public void setFixedAssetType(List<FixedAssetTypeEnum> fixedAssetType) {
			this.fixedAssetType = fixedAssetType;
		}

		public List<BuyTargetEnum> getBuyTarget() {
			return this.buyTarget;
		}

		public void setBuyTarget(List<BuyTargetEnum> buyTarget) {
			this.buyTarget = buyTarget;
		}

		public static class BuyMethodEnum {

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

		public static class FixedAssetTypeEnum {

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

		public static class BuyTargetEnum {

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
	}

	public static class OutInvoice {

		private List<ShellMethodEnum> shellMethod;

		public List<ShellMethodEnum> getShellMethod() {
			return this.shellMethod;
		}

		public void setShellMethod(List<ShellMethodEnum> shellMethod) {
			this.shellMethod = shellMethod;
		}

		public static class ShellMethodEnum {

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
	}

	@Override
	public GetTypeListResponse getInstance(UnmarshallerContext context) {
		return	GetTypeListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
