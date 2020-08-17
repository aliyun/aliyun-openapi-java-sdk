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

package com.aliyuncs.ivpd.model.v20190625;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ivpd.transform.v20190625.HighlightGameVideoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class HighlightGameVideoResponse extends AcsResponse {

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

		private List<GameListItem> gameList;

		private List<HighlightListItem> highlightList;

		public List<GameListItem> getGameList() {
			return this.gameList;
		}

		public void setGameList(List<GameListItem> gameList) {
			this.gameList = gameList;
		}

		public List<HighlightListItem> getHighlightList() {
			return this.highlightList;
		}

		public void setHighlightList(List<HighlightListItem> highlightList) {
			this.highlightList = highlightList;
		}

		public static class GameListItem {

			private String id;

			private Float end;

			private Float start;

			private Map<Object,Object> gameInfo;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public Float getEnd() {
				return this.end;
			}

			public void setEnd(Float end) {
				this.end = end;
			}

			public Float getStart() {
				return this.start;
			}

			public void setStart(Float start) {
				this.start = start;
			}

			public Map<Object,Object> getGameInfo() {
				return this.gameInfo;
			}

			public void setGameInfo(Map<Object,Object> gameInfo) {
				this.gameInfo = gameInfo;
			}
		}

		public static class HighlightListItem {

			private Float start;

			private Float end;

			public Float getStart() {
				return this.start;
			}

			public void setStart(Float start) {
				this.start = start;
			}

			public Float getEnd() {
				return this.end;
			}

			public void setEnd(Float end) {
				this.end = end;
			}
		}
	}

	@Override
	public HighlightGameVideoResponse getInstance(UnmarshallerContext context) {
		return	HighlightGameVideoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
