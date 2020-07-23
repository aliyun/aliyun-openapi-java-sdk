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

package com.aliyuncs.cloudgame.model.v20200429;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudgame.transform.v20200429.ListGamesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGamesResponse extends AcsResponse {

	private String count;

	private Integer pageSize;

	private Integer currentPage;

	private String requestId;

	private List<DataListItem> dataList;

	public String getCount() {
		return this.count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataListItem> getDataList() {
		return this.dataList;
	}

	public void setDataList(List<DataListItem> dataList) {
		this.dataList = dataList;
	}

	public static class DataListItem {

		private String gameId;

		private String gameName;

		private String installPath;

		private String savePath;

		private String resolution;

		private String frameRate;

		private String inputType;

		private String device;

		private String status;

		private String curVersion;

		public String getGameId() {
			return this.gameId;
		}

		public void setGameId(String gameId) {
			this.gameId = gameId;
		}

		public String getGameName() {
			return this.gameName;
		}

		public void setGameName(String gameName) {
			this.gameName = gameName;
		}

		public String getInstallPath() {
			return this.installPath;
		}

		public void setInstallPath(String installPath) {
			this.installPath = installPath;
		}

		public String getSavePath() {
			return this.savePath;
		}

		public void setSavePath(String savePath) {
			this.savePath = savePath;
		}

		public String getResolution() {
			return this.resolution;
		}

		public void setResolution(String resolution) {
			this.resolution = resolution;
		}

		public String getFrameRate() {
			return this.frameRate;
		}

		public void setFrameRate(String frameRate) {
			this.frameRate = frameRate;
		}

		public String getInputType() {
			return this.inputType;
		}

		public void setInputType(String inputType) {
			this.inputType = inputType;
		}

		public String getDevice() {
			return this.device;
		}

		public void setDevice(String device) {
			this.device = device;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCurVersion() {
			return this.curVersion;
		}

		public void setCurVersion(String curVersion) {
			this.curVersion = curVersion;
		}
	}

	@Override
	public ListGamesResponse getInstance(UnmarshallerContext context) {
		return	ListGamesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
