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

package com.aliyuncs.qualitycheck.model.v20160801;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20160801.GetScoreInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetScoreInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<ScorePo> data;

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

	public List<ScorePo> getData() {
		return this.data;
	}

	public void setData(List<ScorePo> data) {
		this.data = data;
	}

	public static class ScorePo {

		private Integer scoreId;

		private String scoreName;

		private List<ScoreParam> scoreInfos;

		public Integer getScoreId() {
			return this.scoreId;
		}

		public void setScoreId(Integer scoreId) {
			this.scoreId = scoreId;
		}

		public String getScoreName() {
			return this.scoreName;
		}

		public void setScoreName(String scoreName) {
			this.scoreName = scoreName;
		}

		public List<ScoreParam> getScoreInfos() {
			return this.scoreInfos;
		}

		public void setScoreInfos(List<ScoreParam> scoreInfos) {
			this.scoreInfos = scoreInfos;
		}

		public static class ScoreParam {

			private Integer scoreNum;

			private Integer scoreSubId;

			private String scoreSubName;

			private Integer scoreType;

			public Integer getScoreNum() {
				return this.scoreNum;
			}

			public void setScoreNum(Integer scoreNum) {
				this.scoreNum = scoreNum;
			}

			public Integer getScoreSubId() {
				return this.scoreSubId;
			}

			public void setScoreSubId(Integer scoreSubId) {
				this.scoreSubId = scoreSubId;
			}

			public String getScoreSubName() {
				return this.scoreSubName;
			}

			public void setScoreSubName(String scoreSubName) {
				this.scoreSubName = scoreSubName;
			}

			public Integer getScoreType() {
				return this.scoreType;
			}

			public void setScoreType(Integer scoreType) {
				this.scoreType = scoreType;
			}
		}
	}

	@Override
	public GetScoreInfoResponse getInstance(UnmarshallerContext context) {
		return	GetScoreInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
