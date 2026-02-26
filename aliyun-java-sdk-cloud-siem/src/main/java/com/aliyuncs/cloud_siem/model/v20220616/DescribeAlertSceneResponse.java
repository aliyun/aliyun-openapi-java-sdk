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

package com.aliyuncs.cloud_siem.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.DescribeAlertSceneResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlertSceneResponse extends AcsResponse {

	private Boolean success;

	private Integer code;

	private String message;

	private String requestId;

	private List<DataItem> data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

		private String alertType;

		private String alertTypeId;

		private String alertName;

		private String alertNameId;

		private String alertTile;

		private String alertTileId;

		private List<Target> targets;

		public String getAlertType() {
			return this.alertType;
		}

		public void setAlertType(String alertType) {
			this.alertType = alertType;
		}

		public String getAlertTypeId() {
			return this.alertTypeId;
		}

		public void setAlertTypeId(String alertTypeId) {
			this.alertTypeId = alertTypeId;
		}

		public String getAlertName() {
			return this.alertName;
		}

		public void setAlertName(String alertName) {
			this.alertName = alertName;
		}

		public String getAlertNameId() {
			return this.alertNameId;
		}

		public void setAlertNameId(String alertNameId) {
			this.alertNameId = alertNameId;
		}

		public String getAlertTile() {
			return this.alertTile;
		}

		public void setAlertTile(String alertTile) {
			this.alertTile = alertTile;
		}

		public String getAlertTileId() {
			return this.alertTileId;
		}

		public void setAlertTileId(String alertTileId) {
			this.alertTileId = alertTileId;
		}

		public List<Target> getTargets() {
			return this.targets;
		}

		public void setTargets(List<Target> targets) {
			this.targets = targets;
		}

		public static class Target {

			private String type;

			private String name;

			private String value;

			private List<String> values;

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

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public List<String> getValues() {
				return this.values;
			}

			public void setValues(List<String> values) {
				this.values = values;
			}
		}
	}

	@Override
	public DescribeAlertSceneResponse getInstance(UnmarshallerContext context) {
		return	DescribeAlertSceneResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
