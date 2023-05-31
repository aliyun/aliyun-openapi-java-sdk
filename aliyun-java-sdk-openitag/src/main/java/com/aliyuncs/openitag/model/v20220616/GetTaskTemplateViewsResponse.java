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

package com.aliyuncs.openitag.model.v20220616;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.openitag.transform.v20220616.GetTaskTemplateViewsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaskTemplateViewsResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Boolean success;

	private String details;

	private String errorCode;

	private Views views;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Views getViews() {
		return this.views;
	}

	public void setViews(Views views) {
		this.views = views;
	}

	public static class Views {

		private List<ViewPluginsItem> viewPlugins;

		public List<ViewPluginsItem> getViewPlugins() {
			return this.viewPlugins;
		}

		public void setViewPlugins(List<ViewPluginsItem> viewPlugins) {
			this.viewPlugins = viewPlugins;
		}

		public static class ViewPluginsItem {

			private String type;

			private Boolean corsProxy;

			private Boolean hide;

			private String convertor;

			private Map<Object,Object> plugins;

			private Map<Object,Object> exif;

			private String bindField;

			private Boolean displayOriImg;

			private List<String> relationQuestionIds;

			private VisitInfo visitInfo;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Boolean getCorsProxy() {
				return this.corsProxy;
			}

			public void setCorsProxy(Boolean corsProxy) {
				this.corsProxy = corsProxy;
			}

			public Boolean getHide() {
				return this.hide;
			}

			public void setHide(Boolean hide) {
				this.hide = hide;
			}

			public String getConvertor() {
				return this.convertor;
			}

			public void setConvertor(String convertor) {
				this.convertor = convertor;
			}

			public Map<Object,Object> getPlugins() {
				return this.plugins;
			}

			public void setPlugins(Map<Object,Object> plugins) {
				this.plugins = plugins;
			}

			public Map<Object,Object> getExif() {
				return this.exif;
			}

			public void setExif(Map<Object,Object> exif) {
				this.exif = exif;
			}

			public String getBindField() {
				return this.bindField;
			}

			public void setBindField(String bindField) {
				this.bindField = bindField;
			}

			public Boolean getDisplayOriImg() {
				return this.displayOriImg;
			}

			public void setDisplayOriImg(Boolean displayOriImg) {
				this.displayOriImg = displayOriImg;
			}

			public List<String> getRelationQuestionIds() {
				return this.relationQuestionIds;
			}

			public void setRelationQuestionIds(List<String> relationQuestionIds) {
				this.relationQuestionIds = relationQuestionIds;
			}

			public VisitInfo getVisitInfo() {
				return this.visitInfo;
			}

			public void setVisitInfo(VisitInfo visitInfo) {
				this.visitInfo = visitInfo;
			}

			public static class VisitInfo {

				private Map<Object,Object> ossConf;

				private Map<Object,Object> aftsConf;

				public Map<Object,Object> getOssConf() {
					return this.ossConf;
				}

				public void setOssConf(Map<Object,Object> ossConf) {
					this.ossConf = ossConf;
				}

				public Map<Object,Object> getAftsConf() {
					return this.aftsConf;
				}

				public void setAftsConf(Map<Object,Object> aftsConf) {
					this.aftsConf = aftsConf;
				}
			}
		}
	}

	@Override
	public GetTaskTemplateViewsResponse getInstance(UnmarshallerContext context) {
		return	GetTaskTemplateViewsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
