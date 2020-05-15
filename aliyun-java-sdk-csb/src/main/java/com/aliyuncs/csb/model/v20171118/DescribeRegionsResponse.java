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

package com.aliyuncs.csb.model.v20171118;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csb.transform.v20171118.DescribeRegionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRegionsResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

		private List<Region> regionList;

		public List<Region> getRegionList() {
			return this.regionList;
		}

		public void setRegionList(List<Region> regionList) {
			this.regionList = regionList;
		}

		public static class Region {

			private String regionId;

			private String regionName;

			private String regionUrl;

			private Boolean isdefault;

			private List<PhysicalLocation> physicalLocations;

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getRegionName() {
				return this.regionName;
			}

			public void setRegionName(String regionName) {
				this.regionName = regionName;
			}

			public String getRegionUrl() {
				return this.regionUrl;
			}

			public void setRegionUrl(String regionUrl) {
				this.regionUrl = regionUrl;
			}

			public Boolean getIsdefault() {
				return this.isdefault;
			}

			public void setIsdefault(Boolean isdefault) {
				this.isdefault = isdefault;
			}

			public List<PhysicalLocation> getPhysicalLocations() {
				return this.physicalLocations;
			}

			public void setPhysicalLocations(List<PhysicalLocation> physicalLocations) {
				this.physicalLocations = physicalLocations;
			}

			public static class PhysicalLocation {

				private String no;

				private String serviceCode;

				private String type;

				private String name;

				private String status;

				private List<Attribute> attributes;

				public String getNo() {
					return this.no;
				}

				public void setNo(String no) {
					this.no = no;
				}

				public String getServiceCode() {
					return this.serviceCode;
				}

				public void setServiceCode(String serviceCode) {
					this.serviceCode = serviceCode;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public List<Attribute> getAttributes() {
					return this.attributes;
				}

				public void setAttributes(List<Attribute> attributes) {
					this.attributes = attributes;
				}

				public static class Attribute {

					private String name;

					private String value;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}
			}
		}
	}

	@Override
	public DescribeRegionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeRegionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
