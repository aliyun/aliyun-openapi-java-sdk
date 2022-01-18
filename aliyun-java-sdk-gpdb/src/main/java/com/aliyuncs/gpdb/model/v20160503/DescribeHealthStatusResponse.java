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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeHealthStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHealthStatusResponse extends AcsResponse {

	private String requestId;

	private String dBClusterId;

	private Status status;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public static class Status {

		private Adbpg_status adbpg_status;

		private Adbpg_connection_status adbpg_connection_status;

		private Adbpg_disk_status adbpg_disk_status;

		private Adbpg_disk_usage_percent adbpg_disk_usage_percent;

		private Adbpg_master_disk_usage_percent_max adbpg_master_disk_usage_percent_max;

		private Adbgp_segment_disk_usage_percent_max adbgp_segment_disk_usage_percent_max;

		private Node_master_status node_master_status;

		private Node_segment_disk_status node_segment_disk_status;

		private Node_master_connection_status node_master_connection_status;

		private Node_segment_connection_status node_segment_connection_status;

		public Adbpg_status getAdbpg_status() {
			return this.adbpg_status;
		}

		public void setAdbpg_status(Adbpg_status adbpg_status) {
			this.adbpg_status = adbpg_status;
		}

		public Adbpg_connection_status getAdbpg_connection_status() {
			return this.adbpg_connection_status;
		}

		public void setAdbpg_connection_status(Adbpg_connection_status adbpg_connection_status) {
			this.adbpg_connection_status = adbpg_connection_status;
		}

		public Adbpg_disk_status getAdbpg_disk_status() {
			return this.adbpg_disk_status;
		}

		public void setAdbpg_disk_status(Adbpg_disk_status adbpg_disk_status) {
			this.adbpg_disk_status = adbpg_disk_status;
		}

		public Adbpg_disk_usage_percent getAdbpg_disk_usage_percent() {
			return this.adbpg_disk_usage_percent;
		}

		public void setAdbpg_disk_usage_percent(Adbpg_disk_usage_percent adbpg_disk_usage_percent) {
			this.adbpg_disk_usage_percent = adbpg_disk_usage_percent;
		}

		public Adbpg_master_disk_usage_percent_max getAdbpg_master_disk_usage_percent_max() {
			return this.adbpg_master_disk_usage_percent_max;
		}

		public void setAdbpg_master_disk_usage_percent_max(Adbpg_master_disk_usage_percent_max adbpg_master_disk_usage_percent_max) {
			this.adbpg_master_disk_usage_percent_max = adbpg_master_disk_usage_percent_max;
		}

		public Adbgp_segment_disk_usage_percent_max getAdbgp_segment_disk_usage_percent_max() {
			return this.adbgp_segment_disk_usage_percent_max;
		}

		public void setAdbgp_segment_disk_usage_percent_max(Adbgp_segment_disk_usage_percent_max adbgp_segment_disk_usage_percent_max) {
			this.adbgp_segment_disk_usage_percent_max = adbgp_segment_disk_usage_percent_max;
		}

		public Node_master_status getNode_master_status() {
			return this.node_master_status;
		}

		public void setNode_master_status(Node_master_status node_master_status) {
			this.node_master_status = node_master_status;
		}

		public Node_segment_disk_status getNode_segment_disk_status() {
			return this.node_segment_disk_status;
		}

		public void setNode_segment_disk_status(Node_segment_disk_status node_segment_disk_status) {
			this.node_segment_disk_status = node_segment_disk_status;
		}

		public Node_master_connection_status getNode_master_connection_status() {
			return this.node_master_connection_status;
		}

		public void setNode_master_connection_status(Node_master_connection_status node_master_connection_status) {
			this.node_master_connection_status = node_master_connection_status;
		}

		public Node_segment_connection_status getNode_segment_connection_status() {
			return this.node_segment_connection_status;
		}

		public void setNode_segment_connection_status(Node_segment_connection_status node_segment_connection_status) {
			this.node_segment_connection_status = node_segment_connection_status;
		}

		public static class Adbpg_status {

			private String status;

			private Float value;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Float getValue() {
				return this.value;
			}

			public void setValue(Float value) {
				this.value = value;
			}
		}

		public static class Adbpg_connection_status {

			private String status;

			private Float value;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Float getValue() {
				return this.value;
			}

			public void setValue(Float value) {
				this.value = value;
			}
		}

		public static class Adbpg_disk_status {

			private String status;

			private Float value;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Float getValue() {
				return this.value;
			}

			public void setValue(Float value) {
				this.value = value;
			}
		}

		public static class Adbpg_disk_usage_percent {

			private String status;

			private Float value;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Float getValue() {
				return this.value;
			}

			public void setValue(Float value) {
				this.value = value;
			}
		}

		public static class Adbpg_master_disk_usage_percent_max {

			private String status;

			private Float value;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Float getValue() {
				return this.value;
			}

			public void setValue(Float value) {
				this.value = value;
			}
		}

		public static class Adbgp_segment_disk_usage_percent_max {

			private String status;

			private Float value;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Float getValue() {
				return this.value;
			}

			public void setValue(Float value) {
				this.value = value;
			}
		}

		public static class Node_master_status {

			private String status;

			private Float value;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Float getValue() {
				return this.value;
			}

			public void setValue(Float value) {
				this.value = value;
			}
		}

		public static class Node_segment_disk_status {

			private String status;

			private Float value;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Float getValue() {
				return this.value;
			}

			public void setValue(Float value) {
				this.value = value;
			}
		}

		public static class Node_master_connection_status {

			private String status;

			private Float value;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Float getValue() {
				return this.value;
			}

			public void setValue(Float value) {
				this.value = value;
			}
		}

		public static class Node_segment_connection_status {

			private String status;

			private Float value;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Float getValue() {
				return this.value;
			}

			public void setValue(Float value) {
				this.value = value;
			}
		}
	}

	@Override
	public DescribeHealthStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeHealthStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
