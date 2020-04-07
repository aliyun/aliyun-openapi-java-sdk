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

package com.aliyuncs.imgsearch.model.v20200320;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imgsearch.transform.v20200320.SearchImageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchImageResponse extends AcsResponse {

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

		private List<MatchListItem> matchList;

		public List<MatchListItem> getMatchList() {
			return this.matchList;
		}

		public void setMatchList(List<MatchListItem> matchList) {
			this.matchList = matchList;
		}

		public static class MatchListItem {

			private String dataId;

			private String extraData;

			private String entityId;

			public String getDataId() {
				return this.dataId;
			}

			public void setDataId(String dataId) {
				this.dataId = dataId;
			}

			public String getExtraData() {
				return this.extraData;
			}

			public void setExtraData(String extraData) {
				this.extraData = extraData;
			}

			public String getEntityId() {
				return this.entityId;
			}

			public void setEntityId(String entityId) {
				this.entityId = entityId;
			}
		}
	}

	@Override
	public SearchImageResponse getInstance(UnmarshallerContext context) {
		return	SearchImageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
