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

package com.aliyuncs.linkwan.model.v20190301;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20190301.ListNodeTransferPacketPathsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNodeTransferPacketPathsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalCount;

		private List<Path> list;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<Path> getList() {
			return this.list;
		}

		public void setList(List<Path> list) {
			this.list = list;
		}

		public static class Path {

			private String gwEui;

			private String devEui;

			private Integer rssi;

			private Float lsnr;

			private Boolean bestPath;

			public String getGwEui() {
				return this.gwEui;
			}

			public void setGwEui(String gwEui) {
				this.gwEui = gwEui;
			}

			public String getDevEui() {
				return this.devEui;
			}

			public void setDevEui(String devEui) {
				this.devEui = devEui;
			}

			public Integer getRssi() {
				return this.rssi;
			}

			public void setRssi(Integer rssi) {
				this.rssi = rssi;
			}

			public Float getLsnr() {
				return this.lsnr;
			}

			public void setLsnr(Float lsnr) {
				this.lsnr = lsnr;
			}

			public Boolean getBestPath() {
				return this.bestPath;
			}

			public void setBestPath(Boolean bestPath) {
				this.bestPath = bestPath;
			}
		}
	}

	@Override
	public ListNodeTransferPacketPathsResponse getInstance(UnmarshallerContext context) {
		return	ListNodeTransferPacketPathsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
