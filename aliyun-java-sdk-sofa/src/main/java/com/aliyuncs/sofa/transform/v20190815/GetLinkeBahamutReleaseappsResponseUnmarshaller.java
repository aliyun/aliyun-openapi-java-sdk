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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutReleaseappsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutReleaseappsResponse.ResultItem;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutReleaseappsResponse.ResultItem.ReleaseReposItem;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutReleaseappsResponse.ResultItem.ReleaseReposItem.ReleaseAppsItem;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutReleaseappsResponse.ResultItem.ReleaseReposItem.ReleaseAppsItem.AppUnitsItem;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutReleaseappsResponse.ResultItem.ReleaseReposItem.ReleaseAppsItem.AppUnitsItem.AppUnitCreatedBysItem;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutReleaseappsResponse.ResultItem.ReleaseReposItem.ReleaseAppsItem.AppUnitsItem.StageStep;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutReleaseappsResponseUnmarshaller {

	public static GetLinkeBahamutReleaseappsResponse unmarshall(GetLinkeBahamutReleaseappsResponse getLinkeBahamutReleaseappsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutReleaseappsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutReleaseappsResponse.RequestId"));
		getLinkeBahamutReleaseappsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutReleaseappsResponse.ResultCode"));
		getLinkeBahamutReleaseappsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutReleaseappsResponse.ResultMessage"));
		getLinkeBahamutReleaseappsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutReleaseappsResponse.ErrorMessage"));
		getLinkeBahamutReleaseappsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutReleaseappsResponse.Message"));
		getLinkeBahamutReleaseappsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutReleaseappsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutReleaseappsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setReleaseId(_ctx.stringValue("GetLinkeBahamutReleaseappsResponse.Result["+ i +"].ReleaseId"));

			List<ReleaseReposItem> releaseRepos = new ArrayList<ReleaseReposItem>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutReleaseappsResponse.Result["+ i +"].ReleaseRepos.Length"); j++) {
				ReleaseReposItem releaseReposItem = new ReleaseReposItem();
				releaseReposItem.setRepoName(_ctx.stringValue("GetLinkeBahamutReleaseappsResponse.Result["+ i +"].ReleaseRepos["+ j +"].RepoName"));

				List<ReleaseAppsItem> releaseApps = new ArrayList<ReleaseAppsItem>();
				for (int k = 0; k < _ctx.lengthValue("GetLinkeBahamutReleaseappsResponse.Result["+ i +"].ReleaseRepos["+ j +"].ReleaseApps.Length"); k++) {
					ReleaseAppsItem releaseAppsItem = new ReleaseAppsItem();
					releaseAppsItem.setAppName(_ctx.stringValue("GetLinkeBahamutReleaseappsResponse.Result["+ i +"].ReleaseRepos["+ j +"].ReleaseApps["+ k +"].AppName"));
					releaseAppsItem.setRelease(_ctx.booleanValue("GetLinkeBahamutReleaseappsResponse.Result["+ i +"].ReleaseRepos["+ j +"].ReleaseApps["+ k +"].Release"));
					releaseAppsItem.setRepoName(_ctx.stringValue("GetLinkeBahamutReleaseappsResponse.Result["+ i +"].ReleaseRepos["+ j +"].ReleaseApps["+ k +"].RepoName"));

					List<AppUnitsItem> appUnits = new ArrayList<AppUnitsItem>();
					for (int l = 0; l < _ctx.lengthValue("GetLinkeBahamutReleaseappsResponse.Result["+ i +"].ReleaseRepos["+ j +"].ReleaseApps["+ k +"].AppUnits.Length"); l++) {
						AppUnitsItem appUnitsItem = new AppUnitsItem();
						appUnitsItem.setCanRemove(_ctx.booleanValue("GetLinkeBahamutReleaseappsResponse.Result["+ i +"].ReleaseRepos["+ j +"].ReleaseApps["+ k +"].AppUnits["+ l +"].CanRemove"));
						appUnitsItem.setIterationId(_ctx.stringValue("GetLinkeBahamutReleaseappsResponse.Result["+ i +"].ReleaseRepos["+ j +"].ReleaseApps["+ k +"].AppUnits["+ l +"].IterationId"));

						StageStep stageStep = new StageStep();
						stageStep.setCurrentIndex(_ctx.longValue("GetLinkeBahamutReleaseappsResponse.Result["+ i +"].ReleaseRepos["+ j +"].ReleaseApps["+ k +"].AppUnits["+ l +"].StageStep.CurrentIndex"));
						stageStep.setDisplayName(_ctx.stringValue("GetLinkeBahamutReleaseappsResponse.Result["+ i +"].ReleaseRepos["+ j +"].ReleaseApps["+ k +"].AppUnits["+ l +"].StageStep.DisplayName"));
						stageStep.setFabricStageName(_ctx.stringValue("GetLinkeBahamutReleaseappsResponse.Result["+ i +"].ReleaseRepos["+ j +"].ReleaseApps["+ k +"].AppUnits["+ l +"].StageStep.FabricStageName"));
						stageStep.setFrontCurrentIndex(_ctx.longValue("GetLinkeBahamutReleaseappsResponse.Result["+ i +"].ReleaseRepos["+ j +"].ReleaseApps["+ k +"].AppUnits["+ l +"].StageStep.FrontCurrentIndex"));
						stageStep.setName(_ctx.stringValue("GetLinkeBahamutReleaseappsResponse.Result["+ i +"].ReleaseRepos["+ j +"].ReleaseApps["+ k +"].AppUnits["+ l +"].StageStep.Name"));
						stageStep.setTotal(_ctx.longValue("GetLinkeBahamutReleaseappsResponse.Result["+ i +"].ReleaseRepos["+ j +"].ReleaseApps["+ k +"].AppUnits["+ l +"].StageStep.Total"));
						appUnitsItem.setStageStep(stageStep);

						List<AppUnitCreatedBysItem> appUnitCreatedBys = new ArrayList<AppUnitCreatedBysItem>();
						for (int m = 0; m < _ctx.lengthValue("GetLinkeBahamutReleaseappsResponse.Result["+ i +"].ReleaseRepos["+ j +"].ReleaseApps["+ k +"].AppUnits["+ l +"].AppUnitCreatedBys.Length"); m++) {
							AppUnitCreatedBysItem appUnitCreatedBysItem = new AppUnitCreatedBysItem();
							appUnitCreatedBysItem.setLinkUrl(_ctx.stringValue("GetLinkeBahamutReleaseappsResponse.Result["+ i +"].ReleaseRepos["+ j +"].ReleaseApps["+ k +"].AppUnits["+ l +"].AppUnitCreatedBys["+ m +"].LinkUrl"));
							appUnitCreatedBysItem.setStageCnName(_ctx.stringValue("GetLinkeBahamutReleaseappsResponse.Result["+ i +"].ReleaseRepos["+ j +"].ReleaseApps["+ k +"].AppUnits["+ l +"].AppUnitCreatedBys["+ m +"].StageCnName"));
							appUnitCreatedBysItem.setSubject(_ctx.stringValue("GetLinkeBahamutReleaseappsResponse.Result["+ i +"].ReleaseRepos["+ j +"].ReleaseApps["+ k +"].AppUnits["+ l +"].AppUnitCreatedBys["+ m +"].Subject"));
							appUnitCreatedBysItem.setTypeCnName(_ctx.stringValue("GetLinkeBahamutReleaseappsResponse.Result["+ i +"].ReleaseRepos["+ j +"].ReleaseApps["+ k +"].AppUnits["+ l +"].AppUnitCreatedBys["+ m +"].TypeCnName"));

							appUnitCreatedBys.add(appUnitCreatedBysItem);
						}
						appUnitsItem.setAppUnitCreatedBys(appUnitCreatedBys);

						appUnits.add(appUnitsItem);
					}
					releaseAppsItem.setAppUnits(appUnits);

					releaseApps.add(releaseAppsItem);
				}
				releaseReposItem.setReleaseApps(releaseApps);

				releaseRepos.add(releaseReposItem);
			}
			resultItem.setReleaseRepos(releaseRepos);

			result.add(resultItem);
		}
		getLinkeBahamutReleaseappsResponse.setResult(result);
	 
	 	return getLinkeBahamutReleaseappsResponse;
	}
}