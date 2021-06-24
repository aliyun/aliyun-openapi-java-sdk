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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsEccQueryNcConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsEccQueryNcConfigResponse extends AcsResponse {

	private String requestId;

	private Data data;

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

		private List<ItemModelsItem> itemModels;

		private NcModel ncModel;

		public List<ItemModelsItem> getItemModels() {
			return this.itemModels;
		}

		public void setItemModels(List<ItemModelsItem> itemModels) {
			this.itemModels = itemModels;
		}

		public NcModel getNcModel() {
			return this.ncModel;
		}

		public void setNcModel(NcModel ncModel) {
			this.ncModel = ncModel;
		}

		public static class ItemModelsItem {

			private String value;

			private String category;

			private String name;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class NcModel {

			private String sN;

			private String ncIp;

			public String getSN() {
				return this.sN;
			}

			public void setSN(String sN) {
				this.sN = sN;
			}

			public String getNcIp() {
				return this.ncIp;
			}

			public void setNcIp(String ncIp) {
				this.ncIp = ncIp;
			}
		}
	}

	@Override
	public OpsEccQueryNcConfigResponse getInstance(UnmarshallerContext context) {
		return	OpsEccQueryNcConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
