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

package com.aliyuncs.airec.model.v20201126;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20201126.ListOfflineStoragesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOfflineStoragesResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String tableName;

		private Map<Object,Object> meta;

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public Map<Object,Object> getMeta() {
			return this.meta;
		}

		public void setMeta(Map<Object,Object> meta) {
			this.meta = meta;
		}
	}

	@Override
	public ListOfflineStoragesResponse getInstance(UnmarshallerContext context) {
		return	ListOfflineStoragesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
