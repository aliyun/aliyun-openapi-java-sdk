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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListETLJobReleaseResponse;
import com.aliyuncs.emr.model.v20160408.ListETLJobReleaseResponse.Release;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListETLJobReleaseResponseUnmarshaller {

	public static ListETLJobReleaseResponse unmarshall(ListETLJobReleaseResponse listETLJobReleaseResponse, UnmarshallerContext _ctx) {
		
		listETLJobReleaseResponse.setRequestId(_ctx.stringValue("ListETLJobReleaseResponse.RequestId"));
		listETLJobReleaseResponse.setTotal(_ctx.integerValue("ListETLJobReleaseResponse.Total"));
		listETLJobReleaseResponse.setPageSize(_ctx.integerValue("ListETLJobReleaseResponse.PageSize"));
		listETLJobReleaseResponse.setPageNumber(_ctx.integerValue("ListETLJobReleaseResponse.PageNumber"));

		List<Release> releaseList = new ArrayList<Release>();
		for (int i = 0; i < _ctx.lengthValue("ListETLJobReleaseResponse.ReleaseList.Length"); i++) {
			Release release = new Release();
			release.setEtlJobId(_ctx.stringValue("ListETLJobReleaseResponse.ReleaseList["+ i +"].EtlJobId"));
			release.setId(_ctx.stringValue("ListETLJobReleaseResponse.ReleaseList["+ i +"].Id"));
			release.setReleaseVersion(_ctx.integerValue("ListETLJobReleaseResponse.ReleaseList["+ i +"].ReleaseVersion"));
			release.setStatus(_ctx.stringValue("ListETLJobReleaseResponse.ReleaseList["+ i +"].Status"));
			release.setGmtCreate(_ctx.longValue("ListETLJobReleaseResponse.ReleaseList["+ i +"].GmtCreate"));
			release.setGmtModified(_ctx.longValue("ListETLJobReleaseResponse.ReleaseList["+ i +"].GmtModified"));

			releaseList.add(release);
		}
		listETLJobReleaseResponse.setReleaseList(releaseList);
	 
	 	return listETLJobReleaseResponse;
	}
}