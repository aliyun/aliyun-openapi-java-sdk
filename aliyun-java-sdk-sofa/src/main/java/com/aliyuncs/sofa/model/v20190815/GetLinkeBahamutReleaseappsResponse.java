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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetLinkeBahamutReleaseappsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeBahamutReleaseappsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String message;

	private Boolean success;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String releaseId;

		private List<ReleaseReposItem> releaseRepos;

		public String getReleaseId() {
			return this.releaseId;
		}

		public void setReleaseId(String releaseId) {
			this.releaseId = releaseId;
		}

		public List<ReleaseReposItem> getReleaseRepos() {
			return this.releaseRepos;
		}

		public void setReleaseRepos(List<ReleaseReposItem> releaseRepos) {
			this.releaseRepos = releaseRepos;
		}

		public static class ReleaseReposItem {

			private String repoName;

			private List<ReleaseAppsItem> releaseApps;

			public String getRepoName() {
				return this.repoName;
			}

			public void setRepoName(String repoName) {
				this.repoName = repoName;
			}

			public List<ReleaseAppsItem> getReleaseApps() {
				return this.releaseApps;
			}

			public void setReleaseApps(List<ReleaseAppsItem> releaseApps) {
				this.releaseApps = releaseApps;
			}

			public static class ReleaseAppsItem {

				private String appName;

				private Boolean release;

				private String repoName;

				private List<AppUnitsItem> appUnits;

				public String getAppName() {
					return this.appName;
				}

				public void setAppName(String appName) {
					this.appName = appName;
				}

				public Boolean getRelease() {
					return this.release;
				}

				public void setRelease(Boolean release) {
					this.release = release;
				}

				public String getRepoName() {
					return this.repoName;
				}

				public void setRepoName(String repoName) {
					this.repoName = repoName;
				}

				public List<AppUnitsItem> getAppUnits() {
					return this.appUnits;
				}

				public void setAppUnits(List<AppUnitsItem> appUnits) {
					this.appUnits = appUnits;
				}

				public static class AppUnitsItem {

					private Boolean canRemove;

					private String iterationId;

					private List<AppUnitCreatedBysItem> appUnitCreatedBys;

					private StageStep stageStep;

					public Boolean getCanRemove() {
						return this.canRemove;
					}

					public void setCanRemove(Boolean canRemove) {
						this.canRemove = canRemove;
					}

					public String getIterationId() {
						return this.iterationId;
					}

					public void setIterationId(String iterationId) {
						this.iterationId = iterationId;
					}

					public List<AppUnitCreatedBysItem> getAppUnitCreatedBys() {
						return this.appUnitCreatedBys;
					}

					public void setAppUnitCreatedBys(List<AppUnitCreatedBysItem> appUnitCreatedBys) {
						this.appUnitCreatedBys = appUnitCreatedBys;
					}

					public StageStep getStageStep() {
						return this.stageStep;
					}

					public void setStageStep(StageStep stageStep) {
						this.stageStep = stageStep;
					}

					public static class AppUnitCreatedBysItem {

						private String linkUrl;

						private String stageCnName;

						private String subject;

						private String typeCnName;

						public String getLinkUrl() {
							return this.linkUrl;
						}

						public void setLinkUrl(String linkUrl) {
							this.linkUrl = linkUrl;
						}

						public String getStageCnName() {
							return this.stageCnName;
						}

						public void setStageCnName(String stageCnName) {
							this.stageCnName = stageCnName;
						}

						public String getSubject() {
							return this.subject;
						}

						public void setSubject(String subject) {
							this.subject = subject;
						}

						public String getTypeCnName() {
							return this.typeCnName;
						}

						public void setTypeCnName(String typeCnName) {
							this.typeCnName = typeCnName;
						}
					}

					public static class StageStep {

						private Long currentIndex;

						private String displayName;

						private String fabricStageName;

						private Long frontCurrentIndex;

						private String name;

						private Long total;

						public Long getCurrentIndex() {
							return this.currentIndex;
						}

						public void setCurrentIndex(Long currentIndex) {
							this.currentIndex = currentIndex;
						}

						public String getDisplayName() {
							return this.displayName;
						}

						public void setDisplayName(String displayName) {
							this.displayName = displayName;
						}

						public String getFabricStageName() {
							return this.fabricStageName;
						}

						public void setFabricStageName(String fabricStageName) {
							this.fabricStageName = fabricStageName;
						}

						public Long getFrontCurrentIndex() {
							return this.frontCurrentIndex;
						}

						public void setFrontCurrentIndex(Long frontCurrentIndex) {
							this.frontCurrentIndex = frontCurrentIndex;
						}

						public String getName() {
							return this.name;
						}

						public void setName(String name) {
							this.name = name;
						}

						public Long getTotal() {
							return this.total;
						}

						public void setTotal(Long total) {
							this.total = total;
						}
					}
				}
			}
		}
	}

	@Override
	public GetLinkeBahamutReleaseappsResponse getInstance(UnmarshallerContext context) {
		return	GetLinkeBahamutReleaseappsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
