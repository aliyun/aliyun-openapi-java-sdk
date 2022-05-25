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

package com.aliyuncs.cms.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeHybridMonitorNamespaceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHybridMonitorNamespaceListResponse extends AcsResponse {

	private String requestId;

	private String success;

	private String code;

	private String message;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer total;

	private List<DescribeHybridMonitorNamespaceItem> describeHybridMonitorNamespace;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<DescribeHybridMonitorNamespaceItem> getDescribeHybridMonitorNamespace() {
		return this.describeHybridMonitorNamespace;
	}

	public void setDescribeHybridMonitorNamespace(List<DescribeHybridMonitorNamespaceItem> describeHybridMonitorNamespace) {
		this.describeHybridMonitorNamespace = describeHybridMonitorNamespace;
	}

	public static class DescribeHybridMonitorNamespaceItem {

		private String description;

		private String createTime;

		private String namespace;

		private Integer isDelete;

		private String id;

		private String modifyTime;

		private Long notAliyunTaskNumber;

		private List<AliyunProductMetric> aliyunProductMetricList;

		private Detail detail;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public Integer getIsDelete() {
			return this.isDelete;
		}

		public void setIsDelete(Integer isDelete) {
			this.isDelete = isDelete;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public Long getNotAliyunTaskNumber() {
			return this.notAliyunTaskNumber;
		}

		public void setNotAliyunTaskNumber(Long notAliyunTaskNumber) {
			this.notAliyunTaskNumber = notAliyunTaskNumber;
		}

		public List<AliyunProductMetric> getAliyunProductMetricList() {
			return this.aliyunProductMetricList;
		}

		public void setAliyunProductMetricList(List<AliyunProductMetric> aliyunProductMetricList) {
			this.aliyunProductMetricList = aliyunProductMetricList;
		}

		public Detail getDetail() {
			return this.detail;
		}

		public void setDetail(Detail detail) {
			this.detail = detail;
		}

		public static class AliyunProductMetric {

			private Long userId;

			private String yAMLConfig;

			private List<Namespace> namespaceList;

			public Long getUserId() {
				return this.userId;
			}

			public void setUserId(Long userId) {
				this.userId = userId;
			}

			public String getYAMLConfig() {
				return this.yAMLConfig;
			}

			public void setYAMLConfig(String yAMLConfig) {
				this.yAMLConfig = yAMLConfig;
			}

			public List<Namespace> getNamespaceList() {
				return this.namespaceList;
			}

			public void setNamespaceList(List<Namespace> namespaceList) {
				this.namespaceList = namespaceList;
			}

			public static class Namespace {

				private String namespace;

				private List<Metric> metricList;

				public String getNamespace() {
					return this.namespace;
				}

				public void setNamespace(String namespace) {
					this.namespace = namespace;
				}

				public List<Metric> getMetricList() {
					return this.metricList;
				}

				public void setMetricList(List<Metric> metricList) {
					this.metricList = metricList;
				}

				public static class Metric {

					private Long period;

					private List<String> list;

					public Long getPeriod() {
						return this.period;
					}

					public void setPeriod(Long period) {
						this.period = period;
					}

					public List<String> getList() {
						return this.list;
					}

					public void setList(List<String> list) {
						this.list = list;
					}
				}
			}
		}

		public static class Detail {

			private String spec;

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
			}
		}
	}

	@Override
	public DescribeHybridMonitorNamespaceListResponse getInstance(UnmarshallerContext context) {
		return	DescribeHybridMonitorNamespaceListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
