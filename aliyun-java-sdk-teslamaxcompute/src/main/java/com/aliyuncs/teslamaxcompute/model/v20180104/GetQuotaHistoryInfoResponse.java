/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.teslamaxcompute.model.v20180104;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.teslamaxcompute.transform.v20180104.GetQuotaHistoryInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQuotaHistoryInfoResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<DataItem> data;

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Integer times;

		private Point point;

		public Integer getTimes() {
			return this.times;
		}

		public void setTimes(Integer times) {
			this.times = times;
		}

		public Point getPoint() {
			return this.point;
		}

		public void setPoint(Point point) {
			this.point = point;
		}

		public static class Point {

			private CpuMaxQuota cpuMaxQuota;

			private CpuMinQuota cpuMinQuota;

			private MemUsed memUsed;

			private CpuUsed cpuUsed;

			private MemMaxQuota memMaxQuota;

			private MemMinQuota memMinQuota;

			public CpuMaxQuota getCpuMaxQuota() {
				return this.cpuMaxQuota;
			}

			public void setCpuMaxQuota(CpuMaxQuota cpuMaxQuota) {
				this.cpuMaxQuota = cpuMaxQuota;
			}

			public CpuMinQuota getCpuMinQuota() {
				return this.cpuMinQuota;
			}

			public void setCpuMinQuota(CpuMinQuota cpuMinQuota) {
				this.cpuMinQuota = cpuMinQuota;
			}

			public MemUsed getMemUsed() {
				return this.memUsed;
			}

			public void setMemUsed(MemUsed memUsed) {
				this.memUsed = memUsed;
			}

			public CpuUsed getCpuUsed() {
				return this.cpuUsed;
			}

			public void setCpuUsed(CpuUsed cpuUsed) {
				this.cpuUsed = cpuUsed;
			}

			public MemMaxQuota getMemMaxQuota() {
				return this.memMaxQuota;
			}

			public void setMemMaxQuota(MemMaxQuota memMaxQuota) {
				this.memMaxQuota = memMaxQuota;
			}

			public MemMinQuota getMemMinQuota() {
				return this.memMinQuota;
			}

			public void setMemMinQuota(MemMinQuota memMinQuota) {
				this.memMinQuota = memMinQuota;
			}

			public static class CpuMaxQuota {

				private Float min;

				private Float max;

				private Float avg;

				public Float getMin() {
					return this.min;
				}

				public void setMin(Float min) {
					this.min = min;
				}

				public Float getMax() {
					return this.max;
				}

				public void setMax(Float max) {
					this.max = max;
				}

				public Float getAvg() {
					return this.avg;
				}

				public void setAvg(Float avg) {
					this.avg = avg;
				}
			}

			public static class CpuMinQuota {

				private Float min;

				private Float max;

				private Float avg;

				public Float getMin() {
					return this.min;
				}

				public void setMin(Float min) {
					this.min = min;
				}

				public Float getMax() {
					return this.max;
				}

				public void setMax(Float max) {
					this.max = max;
				}

				public Float getAvg() {
					return this.avg;
				}

				public void setAvg(Float avg) {
					this.avg = avg;
				}
			}

			public static class MemUsed {

				private Float min;

				private Float max;

				private Float avg;

				public Float getMin() {
					return this.min;
				}

				public void setMin(Float min) {
					this.min = min;
				}

				public Float getMax() {
					return this.max;
				}

				public void setMax(Float max) {
					this.max = max;
				}

				public Float getAvg() {
					return this.avg;
				}

				public void setAvg(Float avg) {
					this.avg = avg;
				}
			}

			public static class CpuUsed {

				private Float min;

				private Float max;

				private Float avg;

				public Float getMin() {
					return this.min;
				}

				public void setMin(Float min) {
					this.min = min;
				}

				public Float getMax() {
					return this.max;
				}

				public void setMax(Float max) {
					this.max = max;
				}

				public Float getAvg() {
					return this.avg;
				}

				public void setAvg(Float avg) {
					this.avg = avg;
				}
			}

			public static class MemMaxQuota {

				private Float min;

				private Float max;

				private Float avg;

				public Float getMin() {
					return this.min;
				}

				public void setMin(Float min) {
					this.min = min;
				}

				public Float getMax() {
					return this.max;
				}

				public void setMax(Float max) {
					this.max = max;
				}

				public Float getAvg() {
					return this.avg;
				}

				public void setAvg(Float avg) {
					this.avg = avg;
				}
			}

			public static class MemMinQuota {

				private Float min;

				private Float max;

				private Float avg;

				public Float getMin() {
					return this.min;
				}

				public void setMin(Float min) {
					this.min = min;
				}

				public Float getMax() {
					return this.max;
				}

				public void setMax(Float max) {
					this.max = max;
				}

				public Float getAvg() {
					return this.avg;
				}

				public void setAvg(Float avg) {
					this.avg = avg;
				}
			}
		}
	}

	@Override
	public GetQuotaHistoryInfoResponse getInstance(UnmarshallerContext context) {
		return	GetQuotaHistoryInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
