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

package com.aliyuncs.iotts.model.v20181126;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iotts.transform.v20181126.GetFieldOptionPassedResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFieldOptionPassedResponse extends AcsResponse {

	private Integer code;

	private String requestId;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<ApplyStatusListItem> applyStatusList;

		private List<ProtocolListItem> protocolList;

		private List<TerminalTypeListItem> terminalTypeList;

		private List<LevelListItem> levelList;

		private List<ServiceTypeListItem> serviceTypeList;

		private List<CertifyTypeListItem> certifyTypeList;

		private List<PlatformListItem> platformList;

		private List<ChipTypeListItem> chipTypeList;

		private List<DeviceTypeListItem> deviceTypeList;

		private List<CertifyPlanListItem> certifyPlanList;

		private List<ProtocolOptsItem> protocolOpts;

		private List<IntegrateTypeListItem> integrateTypeList;

		public List<ApplyStatusListItem> getApplyStatusList() {
			return this.applyStatusList;
		}

		public void setApplyStatusList(List<ApplyStatusListItem> applyStatusList) {
			this.applyStatusList = applyStatusList;
		}

		public List<ProtocolListItem> getProtocolList() {
			return this.protocolList;
		}

		public void setProtocolList(List<ProtocolListItem> protocolList) {
			this.protocolList = protocolList;
		}

		public List<TerminalTypeListItem> getTerminalTypeList() {
			return this.terminalTypeList;
		}

		public void setTerminalTypeList(List<TerminalTypeListItem> terminalTypeList) {
			this.terminalTypeList = terminalTypeList;
		}

		public List<LevelListItem> getLevelList() {
			return this.levelList;
		}

		public void setLevelList(List<LevelListItem> levelList) {
			this.levelList = levelList;
		}

		public List<ServiceTypeListItem> getServiceTypeList() {
			return this.serviceTypeList;
		}

		public void setServiceTypeList(List<ServiceTypeListItem> serviceTypeList) {
			this.serviceTypeList = serviceTypeList;
		}

		public List<CertifyTypeListItem> getCertifyTypeList() {
			return this.certifyTypeList;
		}

		public void setCertifyTypeList(List<CertifyTypeListItem> certifyTypeList) {
			this.certifyTypeList = certifyTypeList;
		}

		public List<PlatformListItem> getPlatformList() {
			return this.platformList;
		}

		public void setPlatformList(List<PlatformListItem> platformList) {
			this.platformList = platformList;
		}

		public List<ChipTypeListItem> getChipTypeList() {
			return this.chipTypeList;
		}

		public void setChipTypeList(List<ChipTypeListItem> chipTypeList) {
			this.chipTypeList = chipTypeList;
		}

		public List<DeviceTypeListItem> getDeviceTypeList() {
			return this.deviceTypeList;
		}

		public void setDeviceTypeList(List<DeviceTypeListItem> deviceTypeList) {
			this.deviceTypeList = deviceTypeList;
		}

		public List<CertifyPlanListItem> getCertifyPlanList() {
			return this.certifyPlanList;
		}

		public void setCertifyPlanList(List<CertifyPlanListItem> certifyPlanList) {
			this.certifyPlanList = certifyPlanList;
		}

		public List<ProtocolOptsItem> getProtocolOpts() {
			return this.protocolOpts;
		}

		public void setProtocolOpts(List<ProtocolOptsItem> protocolOpts) {
			this.protocolOpts = protocolOpts;
		}

		public List<IntegrateTypeListItem> getIntegrateTypeList() {
			return this.integrateTypeList;
		}

		public void setIntegrateTypeList(List<IntegrateTypeListItem> integrateTypeList) {
			this.integrateTypeList = integrateTypeList;
		}

		public static class ApplyStatusListItem {

			private String text;

			private Integer value;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}
		}

		public static class ProtocolListItem {

			private String text;

			private Integer value;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}
		}

		public static class TerminalTypeListItem {

			private String text;

			private Integer value;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}
		}

		public static class LevelListItem {

			private String text;

			private Integer value;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}
		}

		public static class ServiceTypeListItem {

			private String text;

			private Integer value;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}
		}

		public static class CertifyTypeListItem {

			private String text;

			private Integer value;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}
		}

		public static class PlatformListItem {

			private String text;

			private Integer value;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}
		}

		public static class ChipTypeListItem {

			private String text;

			private Integer value;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}
		}

		public static class DeviceTypeListItem {

			private String text;

			private Integer value;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}
		}

		public static class CertifyPlanListItem {

			private String text;

			private Integer value;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Integer getValue() {
				return this.value;
			}

			public void setValue(Integer value) {
				this.value = value;
			}
		}

		public static class ProtocolOptsItem {

			private String text;

			private String value;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class IntegrateTypeListItem {

			private String text;

			private String value;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
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
	public GetFieldOptionPassedResponse getInstance(UnmarshallerContext context) {
		return	GetFieldOptionPassedResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
