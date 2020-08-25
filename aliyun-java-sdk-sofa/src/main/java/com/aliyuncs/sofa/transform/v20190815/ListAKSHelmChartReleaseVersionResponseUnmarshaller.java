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

import com.aliyuncs.sofa.model.v20190815.ListAKSHelmChartReleaseVersionResponse;
import com.aliyuncs.sofa.model.v20190815.ListAKSHelmChartReleaseVersionResponse.ReleaseVersionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAKSHelmChartReleaseVersionResponseUnmarshaller {

	public static ListAKSHelmChartReleaseVersionResponse unmarshall(ListAKSHelmChartReleaseVersionResponse listAKSHelmChartReleaseVersionResponse, UnmarshallerContext _ctx) {
		
		listAKSHelmChartReleaseVersionResponse.setRequestId(_ctx.stringValue("ListAKSHelmChartReleaseVersionResponse.RequestId"));
		listAKSHelmChartReleaseVersionResponse.setResultCode(_ctx.stringValue("ListAKSHelmChartReleaseVersionResponse.ResultCode"));
		listAKSHelmChartReleaseVersionResponse.setResultMessage(_ctx.stringValue("ListAKSHelmChartReleaseVersionResponse.ResultMessage"));
		listAKSHelmChartReleaseVersionResponse.setTotalCount(_ctx.longValue("ListAKSHelmChartReleaseVersionResponse.TotalCount"));

		List<ReleaseVersionsItem> releaseVersions = new ArrayList<ReleaseVersionsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAKSHelmChartReleaseVersionResponse.ReleaseVersions.Length"); i++) {
			ReleaseVersionsItem releaseVersionsItem = new ReleaseVersionsItem();
			releaseVersionsItem.setChartId(_ctx.stringValue("ListAKSHelmChartReleaseVersionResponse.ReleaseVersions["+ i +"].ChartId"));
			releaseVersionsItem.setChartName(_ctx.stringValue("ListAKSHelmChartReleaseVersionResponse.ReleaseVersions["+ i +"].ChartName"));
			releaseVersionsItem.setChartVersion(_ctx.stringValue("ListAKSHelmChartReleaseVersionResponse.ReleaseVersions["+ i +"].ChartVersion"));
			releaseVersionsItem.setClusterId(_ctx.stringValue("ListAKSHelmChartReleaseVersionResponse.ReleaseVersions["+ i +"].ClusterId"));
			releaseVersionsItem.setGmtCreated(_ctx.stringValue("ListAKSHelmChartReleaseVersionResponse.ReleaseVersions["+ i +"].GmtCreated"));
			releaseVersionsItem.setGmtModified(_ctx.stringValue("ListAKSHelmChartReleaseVersionResponse.ReleaseVersions["+ i +"].GmtModified"));
			releaseVersionsItem.setId(_ctx.stringValue("ListAKSHelmChartReleaseVersionResponse.ReleaseVersions["+ i +"].Id"));
			releaseVersionsItem.setNamespace(_ctx.stringValue("ListAKSHelmChartReleaseVersionResponse.ReleaseVersions["+ i +"].Namespace"));
			releaseVersionsItem.setOperator(_ctx.stringValue("ListAKSHelmChartReleaseVersionResponse.ReleaseVersions["+ i +"].Operator"));
			releaseVersionsItem.setReleaseLog(_ctx.stringValue("ListAKSHelmChartReleaseVersionResponse.ReleaseVersions["+ i +"].ReleaseLog"));
			releaseVersionsItem.setReleaseName(_ctx.stringValue("ListAKSHelmChartReleaseVersionResponse.ReleaseVersions["+ i +"].ReleaseName"));
			releaseVersionsItem.setRevision(_ctx.longValue("ListAKSHelmChartReleaseVersionResponse.ReleaseVersions["+ i +"].Revision"));
			releaseVersionsItem.setStatus(_ctx.longValue("ListAKSHelmChartReleaseVersionResponse.ReleaseVersions["+ i +"].Status"));
			releaseVersionsItem.setSuperseded(_ctx.longValue("ListAKSHelmChartReleaseVersionResponse.ReleaseVersions["+ i +"].Superseded"));

			releaseVersions.add(releaseVersionsItem);
		}
		listAKSHelmChartReleaseVersionResponse.setReleaseVersions(releaseVersions);
	 
	 	return listAKSHelmChartReleaseVersionResponse;
	}
}