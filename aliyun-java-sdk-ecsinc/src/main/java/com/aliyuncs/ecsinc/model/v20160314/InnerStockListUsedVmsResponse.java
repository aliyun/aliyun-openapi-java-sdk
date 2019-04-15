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

package com.aliyuncs.ecsinc.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.InnerStockListUsedVmsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerStockListUsedVmsResponse extends AcsResponse {

	private String requestId;

	private ErrorCode errorCode;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ErrorCode getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class ErrorCode {

		private String code;

		private String message;

		private Boolean isSuccess;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Boolean getIsSuccess() {
			return this.isSuccess;
		}

		public void setIsSuccess(Boolean isSuccess) {
			this.isSuccess = isSuccess;
		}
	}

	public static class Data {

		private String privateIps;

		private String diskType;

		private String publicIps;

		private String localDiskCap;

		private String macs;

		private String zoneId;

		private String cloudDiskCap;

		private List<Vm> vms;

		public String getPrivateIps() {
			return this.privateIps;
		}

		public void setPrivateIps(String privateIps) {
			this.privateIps = privateIps;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public String getPublicIps() {
			return this.publicIps;
		}

		public void setPublicIps(String publicIps) {
			this.publicIps = publicIps;
		}

		public String getLocalDiskCap() {
			return this.localDiskCap;
		}

		public void setLocalDiskCap(String localDiskCap) {
			this.localDiskCap = localDiskCap;
		}

		public String getMacs() {
			return this.macs;
		}

		public void setMacs(String macs) {
			this.macs = macs;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getCloudDiskCap() {
			return this.cloudDiskCap;
		}

		public void setCloudDiskCap(String cloudDiskCap) {
			this.cloudDiskCap = cloudDiskCap;
		}

		public List<Vm> getVms() {
			return this.vms;
		}

		public void setVms(List<Vm> vms) {
			this.vms = vms;
		}

		public static class Vm {

			private String total;

			private String num;

			private String name;

			public String getTotal() {
				return this.total;
			}

			public void setTotal(String total) {
				this.total = total;
			}

			public String getNum() {
				return this.num;
			}

			public void setNum(String num) {
				this.num = num;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public InnerStockListUsedVmsResponse getInstance(UnmarshallerContext context) {
		return	InnerStockListUsedVmsResponseUnmarshaller.unmarshall(this, context);
	}
}
