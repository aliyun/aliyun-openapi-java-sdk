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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeImageSensitiveFileListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeImageSensitiveFileListResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribeImageSensitiveFileListResponse.SensitiveFileListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageSensitiveFileListResponseUnmarshaller {

	public static DescribeImageSensitiveFileListResponse unmarshall(DescribeImageSensitiveFileListResponse describeImageSensitiveFileListResponse, UnmarshallerContext _ctx) {
		
		describeImageSensitiveFileListResponse.setRequestId(_ctx.stringValue("DescribeImageSensitiveFileListResponse.RequestId"));
		describeImageSensitiveFileListResponse.setSuccess(_ctx.booleanValue("DescribeImageSensitiveFileListResponse.Success"));
		describeImageSensitiveFileListResponse.setCode(_ctx.stringValue("DescribeImageSensitiveFileListResponse.Code"));
		describeImageSensitiveFileListResponse.setMessage(_ctx.stringValue("DescribeImageSensitiveFileListResponse.Message"));
		describeImageSensitiveFileListResponse.setHttpStatusCode(_ctx.integerValue("DescribeImageSensitiveFileListResponse.HttpStatusCode"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeImageSensitiveFileListResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeImageSensitiveFileListResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeImageSensitiveFileListResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeImageSensitiveFileListResponse.PageInfo.Count"));
		pageInfo.setLastRowKey(_ctx.stringValue("DescribeImageSensitiveFileListResponse.PageInfo.LastRowKey"));
		describeImageSensitiveFileListResponse.setPageInfo(pageInfo);

		List<SensitiveFileListItem> sensitiveFileList = new ArrayList<SensitiveFileListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageSensitiveFileListResponse.SensitiveFileList.Length"); i++) {
			SensitiveFileListItem sensitiveFileListItem = new SensitiveFileListItem();
			sensitiveFileListItem.setRiskLevel(_ctx.stringValue("DescribeImageSensitiveFileListResponse.SensitiveFileList["+ i +"].RiskLevel"));
			sensitiveFileListItem.setSensitiveFileKey(_ctx.stringValue("DescribeImageSensitiveFileListResponse.SensitiveFileList["+ i +"].SensitiveFileKey"));
			sensitiveFileListItem.setSensitiveFileName(_ctx.stringValue("DescribeImageSensitiveFileListResponse.SensitiveFileList["+ i +"].SensitiveFileName"));
			sensitiveFileListItem.setFirstScanTime(_ctx.longValue("DescribeImageSensitiveFileListResponse.SensitiveFileList["+ i +"].FirstScanTime"));
			sensitiveFileListItem.setLastScanTime(_ctx.longValue("DescribeImageSensitiveFileListResponse.SensitiveFileList["+ i +"].LastScanTime"));
			sensitiveFileListItem.setCount(_ctx.integerValue("DescribeImageSensitiveFileListResponse.SensitiveFileList["+ i +"].Count"));

			sensitiveFileList.add(sensitiveFileListItem);
		}
		describeImageSensitiveFileListResponse.setSensitiveFileList(sensitiveFileList);
	 
	 	return describeImageSensitiveFileListResponse;
	}
}