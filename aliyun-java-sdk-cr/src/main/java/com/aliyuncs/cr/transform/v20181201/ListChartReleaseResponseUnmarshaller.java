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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.ListChartReleaseResponse;
import com.aliyuncs.cr.model.v20181201.ListChartReleaseResponse.ChartReleasesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListChartReleaseResponseUnmarshaller {

	public static ListChartReleaseResponse unmarshall(ListChartReleaseResponse listChartReleaseResponse, UnmarshallerContext _ctx) {
		
		listChartReleaseResponse.setRequestId(_ctx.stringValue("ListChartReleaseResponse.RequestId"));
		listChartReleaseResponse.setIsSuccess(_ctx.booleanValue("ListChartReleaseResponse.IsSuccess"));
		listChartReleaseResponse.setCode(_ctx.stringValue("ListChartReleaseResponse.Code"));
		listChartReleaseResponse.setPageNo(_ctx.integerValue("ListChartReleaseResponse.PageNo"));
		listChartReleaseResponse.setPageSize(_ctx.integerValue("ListChartReleaseResponse.PageSize"));
		listChartReleaseResponse.setTotalCount(_ctx.stringValue("ListChartReleaseResponse.TotalCount"));

		List<ChartReleasesItem> chartReleases = new ArrayList<ChartReleasesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListChartReleaseResponse.ChartReleases.Length"); i++) {
			ChartReleasesItem chartReleasesItem = new ChartReleasesItem();
			chartReleasesItem.setChart(_ctx.stringValue("ListChartReleaseResponse.ChartReleases["+ i +"].Chart"));
			chartReleasesItem.setRelease(_ctx.stringValue("ListChartReleaseResponse.ChartReleases["+ i +"].Release"));
			chartReleasesItem.setStatus(_ctx.stringValue("ListChartReleaseResponse.ChartReleases["+ i +"].Status"));
			chartReleasesItem.setSize(_ctx.stringValue("ListChartReleaseResponse.ChartReleases["+ i +"].Size"));
			chartReleasesItem.setInstanceId(_ctx.stringValue("ListChartReleaseResponse.ChartReleases["+ i +"].InstanceId"));
			chartReleasesItem.setRepoId(_ctx.stringValue("ListChartReleaseResponse.ChartReleases["+ i +"].RepoId"));
			chartReleasesItem.setModifiedTime(_ctx.longValue("ListChartReleaseResponse.ChartReleases["+ i +"].ModifiedTime"));

			chartReleases.add(chartReleasesItem);
		}
		listChartReleaseResponse.setChartReleases(chartReleases);
	 
	 	return listChartReleaseResponse;
	}
}