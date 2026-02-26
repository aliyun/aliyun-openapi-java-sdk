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

import com.aliyuncs.sas.model.v20181203.DescribeImageSensitiveFileByKeyResponse;
import com.aliyuncs.sas.model.v20181203.DescribeImageSensitiveFileByKeyResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribeImageSensitiveFileByKeyResponse.SensitiveFileListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageSensitiveFileByKeyResponseUnmarshaller {

	public static DescribeImageSensitiveFileByKeyResponse unmarshall(DescribeImageSensitiveFileByKeyResponse describeImageSensitiveFileByKeyResponse, UnmarshallerContext _ctx) {
		
		describeImageSensitiveFileByKeyResponse.setRequestId(_ctx.stringValue("DescribeImageSensitiveFileByKeyResponse.RequestId"));
		describeImageSensitiveFileByKeyResponse.setSuccess(_ctx.booleanValue("DescribeImageSensitiveFileByKeyResponse.Success"));
		describeImageSensitiveFileByKeyResponse.setCode(_ctx.stringValue("DescribeImageSensitiveFileByKeyResponse.Code"));
		describeImageSensitiveFileByKeyResponse.setMessage(_ctx.stringValue("DescribeImageSensitiveFileByKeyResponse.Message"));
		describeImageSensitiveFileByKeyResponse.setHttpStatusCode(_ctx.integerValue("DescribeImageSensitiveFileByKeyResponse.HttpStatusCode"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeImageSensitiveFileByKeyResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeImageSensitiveFileByKeyResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeImageSensitiveFileByKeyResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeImageSensitiveFileByKeyResponse.PageInfo.Count"));
		pageInfo.setLastRowKey(_ctx.stringValue("DescribeImageSensitiveFileByKeyResponse.PageInfo.LastRowKey"));
		describeImageSensitiveFileByKeyResponse.setPageInfo(pageInfo);

		List<SensitiveFileListItem> sensitiveFileList = new ArrayList<SensitiveFileListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageSensitiveFileByKeyResponse.SensitiveFileList.Length"); i++) {
			SensitiveFileListItem sensitiveFileListItem = new SensitiveFileListItem();
			sensitiveFileListItem.setFilePath(_ctx.stringValue("DescribeImageSensitiveFileByKeyResponse.SensitiveFileList["+ i +"].FilePath"));
			sensitiveFileListItem.setLayerDigest(_ctx.stringValue("DescribeImageSensitiveFileByKeyResponse.SensitiveFileList["+ i +"].LayerDigest"));
			sensitiveFileListItem.setPromt(_ctx.stringValue("DescribeImageSensitiveFileByKeyResponse.SensitiveFileList["+ i +"].Promt"));
			sensitiveFileListItem.setAdvice(_ctx.stringValue("DescribeImageSensitiveFileByKeyResponse.SensitiveFileList["+ i +"].Advice"));
			sensitiveFileListItem.setRiskLevel(_ctx.stringValue("DescribeImageSensitiveFileByKeyResponse.SensitiveFileList["+ i +"].RiskLevel"));
			sensitiveFileListItem.setSensitiveFileKey(_ctx.stringValue("DescribeImageSensitiveFileByKeyResponse.SensitiveFileList["+ i +"].SensitiveFileKey"));
			sensitiveFileListItem.setSensitiveFileName(_ctx.stringValue("DescribeImageSensitiveFileByKeyResponse.SensitiveFileList["+ i +"].SensitiveFileName"));
			sensitiveFileListItem.setFirstScanTime(_ctx.longValue("DescribeImageSensitiveFileByKeyResponse.SensitiveFileList["+ i +"].FirstScanTime"));
			sensitiveFileListItem.setLastScanTime(_ctx.longValue("DescribeImageSensitiveFileByKeyResponse.SensitiveFileList["+ i +"].LastScanTime"));

			sensitiveFileList.add(sensitiveFileListItem);
		}
		describeImageSensitiveFileByKeyResponse.setSensitiveFileList(sensitiveFileList);
	 
	 	return describeImageSensitiveFileByKeyResponse;
	}
}