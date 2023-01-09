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

package com.aliyuncs.pts.model.v20201020;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20201020.GetPtsSceneBaseLineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPtsSceneBaseLineResponse extends AcsResponse {

	private String sceneId;

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private Baseline baseline;

	public String getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Baseline getBaseline() {
		return this.baseline;
	}

	public void setBaseline(Baseline baseline) {
		this.baseline = baseline;
	}

	public static class Baseline {

		private String name;

		private List<ChainBaselineData> apiBaselines;

		private SceneBaseline sceneBaseline;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<ChainBaselineData> getApiBaselines() {
			return this.apiBaselines;
		}

		public void setApiBaselines(List<ChainBaselineData> apiBaselines) {
			this.apiBaselines = apiBaselines;
		}

		public SceneBaseline getSceneBaseline() {
			return this.sceneBaseline;
		}

		public void setSceneBaseline(SceneBaseline sceneBaseline) {
			this.sceneBaseline = sceneBaseline;
		}

		public static class ChainBaselineData {

			private Long failCountBiz;

			private Float avgTps;

			private Integer minRt;

			private Float seg99Rt;

			private Integer maxRt;

			private Float seg90Rt;

			private Float successRateBiz;

			private Float avgRt;

			private Long failCountReq;

			private String name;

			private Float successRateReq;

			private Long id;

			public Long getFailCountBiz() {
				return this.failCountBiz;
			}

			public void setFailCountBiz(Long failCountBiz) {
				this.failCountBiz = failCountBiz;
			}

			public Float getAvgTps() {
				return this.avgTps;
			}

			public void setAvgTps(Float avgTps) {
				this.avgTps = avgTps;
			}

			public Integer getMinRt() {
				return this.minRt;
			}

			public void setMinRt(Integer minRt) {
				this.minRt = minRt;
			}

			public Float getSeg99Rt() {
				return this.seg99Rt;
			}

			public void setSeg99Rt(Float seg99Rt) {
				this.seg99Rt = seg99Rt;
			}

			public Integer getMaxRt() {
				return this.maxRt;
			}

			public void setMaxRt(Integer maxRt) {
				this.maxRt = maxRt;
			}

			public Float getSeg90Rt() {
				return this.seg90Rt;
			}

			public void setSeg90Rt(Float seg90Rt) {
				this.seg90Rt = seg90Rt;
			}

			public Float getSuccessRateBiz() {
				return this.successRateBiz;
			}

			public void setSuccessRateBiz(Float successRateBiz) {
				this.successRateBiz = successRateBiz;
			}

			public Float getAvgRt() {
				return this.avgRt;
			}

			public void setAvgRt(Float avgRt) {
				this.avgRt = avgRt;
			}

			public Long getFailCountReq() {
				return this.failCountReq;
			}

			public void setFailCountReq(Long failCountReq) {
				this.failCountReq = failCountReq;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Float getSuccessRateReq() {
				return this.successRateReq;
			}

			public void setSuccessRateReq(Float successRateReq) {
				this.successRateReq = successRateReq;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}

		public static class SceneBaseline {

			private Long failCountBiz;

			private Float successRateBiz;

			private Float avgRt;

			private Long failCountReq;

			private Float avgTps;

			private Float seg99Rt;

			private Float successRateReq;

			private Float seg90Rt;

			public Long getFailCountBiz() {
				return this.failCountBiz;
			}

			public void setFailCountBiz(Long failCountBiz) {
				this.failCountBiz = failCountBiz;
			}

			public Float getSuccessRateBiz() {
				return this.successRateBiz;
			}

			public void setSuccessRateBiz(Float successRateBiz) {
				this.successRateBiz = successRateBiz;
			}

			public Float getAvgRt() {
				return this.avgRt;
			}

			public void setAvgRt(Float avgRt) {
				this.avgRt = avgRt;
			}

			public Long getFailCountReq() {
				return this.failCountReq;
			}

			public void setFailCountReq(Long failCountReq) {
				this.failCountReq = failCountReq;
			}

			public Float getAvgTps() {
				return this.avgTps;
			}

			public void setAvgTps(Float avgTps) {
				this.avgTps = avgTps;
			}

			public Float getSeg99Rt() {
				return this.seg99Rt;
			}

			public void setSeg99Rt(Float seg99Rt) {
				this.seg99Rt = seg99Rt;
			}

			public Float getSuccessRateReq() {
				return this.successRateReq;
			}

			public void setSuccessRateReq(Float successRateReq) {
				this.successRateReq = successRateReq;
			}

			public Float getSeg90Rt() {
				return this.seg90Rt;
			}

			public void setSeg90Rt(Float seg90Rt) {
				this.seg90Rt = seg90Rt;
			}
		}
	}

	@Override
	public GetPtsSceneBaseLineResponse getInstance(UnmarshallerContext context) {
		return	GetPtsSceneBaseLineResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
