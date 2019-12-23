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

package com.aliyuncs.alikafka.model.v20190916;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alikafka.transform.v20190916.GetMetaProductListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMetaProductListResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private Integer code;

	private String message;

	private MetaData metaData;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public MetaData getMetaData() {
		return this.metaData;
	}

	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}

	public static class MetaData {

		private Map<Object,Object> names;

		private List<SpecVO> productsNormal;

		private List<SpecVO> productsProfessional;

		public Map<Object,Object> getNames() {
			return this.names;
		}

		public void setNames(Map<Object,Object> names) {
			this.names = names;
		}

		public List<SpecVO> getProductsNormal() {
			return this.productsNormal;
		}

		public void setProductsNormal(List<SpecVO> productsNormal) {
			this.productsNormal = productsNormal;
		}

		public List<SpecVO> getProductsProfessional() {
			return this.productsProfessional;
		}

		public void setProductsProfessional(List<SpecVO> productsProfessional) {
			this.productsProfessional = productsProfessional;
		}

		public static class SpecVO {

			private String regionId;

			private String specType;

			private Long ioMax;

			private String diskType;

			private String diskSize;

			private String topicQuota;

			private String deployType;

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getSpecType() {
				return this.specType;
			}

			public void setSpecType(String specType) {
				this.specType = specType;
			}

			public Long getIoMax() {
				return this.ioMax;
			}

			public void setIoMax(Long ioMax) {
				this.ioMax = ioMax;
			}

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}

			public String getDiskSize() {
				return this.diskSize;
			}

			public void setDiskSize(String diskSize) {
				this.diskSize = diskSize;
			}

			public String getTopicQuota() {
				return this.topicQuota;
			}

			public void setTopicQuota(String topicQuota) {
				this.topicQuota = topicQuota;
			}

			public String getDeployType() {
				return this.deployType;
			}

			public void setDeployType(String deployType) {
				this.deployType = deployType;
			}
		}
	}

	@Override
	public GetMetaProductListResponse getInstance(UnmarshallerContext context) {
		return	GetMetaProductListResponseUnmarshaller.unmarshall(this, context);
	}
}
