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

import com.aliyuncs.cr.model.v20181201.ListRepoTagScanResultResponse;
import com.aliyuncs.cr.model.v20181201.ListRepoTagScanResultResponse.VulnerabilitiesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepoTagScanResultResponseUnmarshaller {

	public static ListRepoTagScanResultResponse unmarshall(ListRepoTagScanResultResponse listRepoTagScanResultResponse, UnmarshallerContext _ctx) {
		
		listRepoTagScanResultResponse.setRequestId(_ctx.stringValue("ListRepoTagScanResultResponse.RequestId"));
		listRepoTagScanResultResponse.setIsSuccess(_ctx.booleanValue("ListRepoTagScanResultResponse.IsSuccess"));
		listRepoTagScanResultResponse.setCode(_ctx.stringValue("ListRepoTagScanResultResponse.Code"));
		listRepoTagScanResultResponse.setPageNo(_ctx.integerValue("ListRepoTagScanResultResponse.PageNo"));
		listRepoTagScanResultResponse.setPageSize(_ctx.integerValue("ListRepoTagScanResultResponse.PageSize"));
		listRepoTagScanResultResponse.setTotalCount(_ctx.integerValue("ListRepoTagScanResultResponse.TotalCount"));

		List<VulnerabilitiesItem> vulnerabilities = new ArrayList<VulnerabilitiesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepoTagScanResultResponse.Vulnerabilities.Length"); i++) {
			VulnerabilitiesItem vulnerabilitiesItem = new VulnerabilitiesItem();
			vulnerabilitiesItem.setFeature(_ctx.stringValue("ListRepoTagScanResultResponse.Vulnerabilities["+ i +"].Feature"));
			vulnerabilitiesItem.setVersion(_ctx.stringValue("ListRepoTagScanResultResponse.Vulnerabilities["+ i +"].Version"));
			vulnerabilitiesItem.setVersionFormat(_ctx.stringValue("ListRepoTagScanResultResponse.Vulnerabilities["+ i +"].VersionFormat"));
			vulnerabilitiesItem.setAddedBy(_ctx.stringValue("ListRepoTagScanResultResponse.Vulnerabilities["+ i +"].AddedBy"));
			vulnerabilitiesItem.setCveName(_ctx.stringValue("ListRepoTagScanResultResponse.Vulnerabilities["+ i +"].CveName"));
			vulnerabilitiesItem.setCveLink(_ctx.stringValue("ListRepoTagScanResultResponse.Vulnerabilities["+ i +"].CveLink"));
			vulnerabilitiesItem.setDescription(_ctx.stringValue("ListRepoTagScanResultResponse.Vulnerabilities["+ i +"].Description"));
			vulnerabilitiesItem.setSeverity(_ctx.stringValue("ListRepoTagScanResultResponse.Vulnerabilities["+ i +"].Severity"));
			vulnerabilitiesItem.setVersionFixed(_ctx.stringValue("ListRepoTagScanResultResponse.Vulnerabilities["+ i +"].VersionFixed"));

			vulnerabilities.add(vulnerabilitiesItem);
		}
		listRepoTagScanResultResponse.setVulnerabilities(vulnerabilities);
	 
	 	return listRepoTagScanResultResponse;
	}
}