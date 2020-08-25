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

import com.aliyuncs.sofa.model.v20190815.GetAKSHelmChartReleaseStatusResponse;
import com.aliyuncs.sofa.model.v20190815.GetAKSHelmChartReleaseStatusResponse.MainChartRelease;
import com.aliyuncs.sofa.model.v20190815.GetAKSHelmChartReleaseStatusResponse.SubChartReleasesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAKSHelmChartReleaseStatusResponseUnmarshaller {

	public static GetAKSHelmChartReleaseStatusResponse unmarshall(GetAKSHelmChartReleaseStatusResponse getAKSHelmChartReleaseStatusResponse, UnmarshallerContext _ctx) {
		
		getAKSHelmChartReleaseStatusResponse.setRequestId(_ctx.stringValue("GetAKSHelmChartReleaseStatusResponse.RequestId"));
		getAKSHelmChartReleaseStatusResponse.setResultCode(_ctx.stringValue("GetAKSHelmChartReleaseStatusResponse.ResultCode"));
		getAKSHelmChartReleaseStatusResponse.setResultMessage(_ctx.stringValue("GetAKSHelmChartReleaseStatusResponse.ResultMessage"));

		MainChartRelease mainChartRelease = new MainChartRelease();
		mainChartRelease.setChartId(_ctx.stringValue("GetAKSHelmChartReleaseStatusResponse.MainChartRelease.ChartId"));
		mainChartRelease.setChartName(_ctx.stringValue("GetAKSHelmChartReleaseStatusResponse.MainChartRelease.ChartName"));
		mainChartRelease.setChartVersion(_ctx.stringValue("GetAKSHelmChartReleaseStatusResponse.MainChartRelease.ChartVersion"));
		mainChartRelease.setClusterId(_ctx.stringValue("GetAKSHelmChartReleaseStatusResponse.MainChartRelease.ClusterId"));
		mainChartRelease.setGmtCreated(_ctx.stringValue("GetAKSHelmChartReleaseStatusResponse.MainChartRelease.GmtCreated"));
		mainChartRelease.setGmtModified(_ctx.stringValue("GetAKSHelmChartReleaseStatusResponse.MainChartRelease.GmtModified"));
		mainChartRelease.setId(_ctx.stringValue("GetAKSHelmChartReleaseStatusResponse.MainChartRelease.Id"));
		mainChartRelease.setNamespace(_ctx.stringValue("GetAKSHelmChartReleaseStatusResponse.MainChartRelease.Namespace"));
		mainChartRelease.setOperator(_ctx.stringValue("GetAKSHelmChartReleaseStatusResponse.MainChartRelease.Operator"));
		mainChartRelease.setReleaseLog(_ctx.stringValue("GetAKSHelmChartReleaseStatusResponse.MainChartRelease.ReleaseLog"));
		mainChartRelease.setReleaseName(_ctx.stringValue("GetAKSHelmChartReleaseStatusResponse.MainChartRelease.ReleaseName"));
		mainChartRelease.setRevision(_ctx.longValue("GetAKSHelmChartReleaseStatusResponse.MainChartRelease.Revision"));
		mainChartRelease.setStatus(_ctx.longValue("GetAKSHelmChartReleaseStatusResponse.MainChartRelease.Status"));
		mainChartRelease.setSuperseded(_ctx.longValue("GetAKSHelmChartReleaseStatusResponse.MainChartRelease.Superseded"));
		getAKSHelmChartReleaseStatusResponse.setMainChartRelease(mainChartRelease);

		List<SubChartReleasesItem> subChartReleases = new ArrayList<SubChartReleasesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAKSHelmChartReleaseStatusResponse.SubChartReleases.Length"); i++) {
			SubChartReleasesItem subChartReleasesItem = new SubChartReleasesItem();
			subChartReleasesItem.setId(_ctx.stringValue("GetAKSHelmChartReleaseStatusResponse.SubChartReleases["+ i +"].Id"));
			subChartReleasesItem.setMainChartReleaseId(_ctx.stringValue("GetAKSHelmChartReleaseStatusResponse.SubChartReleases["+ i +"].MainChartReleaseId"));
			subChartReleasesItem.setReleaseLog(_ctx.stringValue("GetAKSHelmChartReleaseStatusResponse.SubChartReleases["+ i +"].ReleaseLog"));
			subChartReleasesItem.setRevision(_ctx.longValue("GetAKSHelmChartReleaseStatusResponse.SubChartReleases["+ i +"].Revision"));
			subChartReleasesItem.setStatus(_ctx.longValue("GetAKSHelmChartReleaseStatusResponse.SubChartReleases["+ i +"].Status"));
			subChartReleasesItem.setSubChartName(_ctx.stringValue("GetAKSHelmChartReleaseStatusResponse.SubChartReleases["+ i +"].SubChartName"));
			subChartReleasesItem.setSubChartReleaseName(_ctx.stringValue("GetAKSHelmChartReleaseStatusResponse.SubChartReleases["+ i +"].SubChartReleaseName"));
			subChartReleasesItem.setSubChartVersion(_ctx.stringValue("GetAKSHelmChartReleaseStatusResponse.SubChartReleases["+ i +"].SubChartVersion"));
			subChartReleasesItem.setSuperseded(_ctx.longValue("GetAKSHelmChartReleaseStatusResponse.SubChartReleases["+ i +"].Superseded"));

			subChartReleases.add(subChartReleasesItem);
		}
		getAKSHelmChartReleaseStatusResponse.setSubChartReleases(subChartReleases);
	 
	 	return getAKSHelmChartReleaseStatusResponse;
	}
}