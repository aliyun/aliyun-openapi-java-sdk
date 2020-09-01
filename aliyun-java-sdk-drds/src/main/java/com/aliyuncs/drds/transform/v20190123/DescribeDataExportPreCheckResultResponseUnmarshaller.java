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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeDataExportPreCheckResultResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDataExportPreCheckResultResponse.PreCheckResult;
import com.aliyuncs.drds.model.v20190123.DescribeDataExportPreCheckResultResponse.PreCheckResult.SubCheckItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataExportPreCheckResultResponseUnmarshaller {

	public static DescribeDataExportPreCheckResultResponse unmarshall(DescribeDataExportPreCheckResultResponse describeDataExportPreCheckResultResponse, UnmarshallerContext _ctx) {
		
		describeDataExportPreCheckResultResponse.setRequestId(_ctx.stringValue("DescribeDataExportPreCheckResultResponse.RequestId"));
		describeDataExportPreCheckResultResponse.setSuccess(_ctx.booleanValue("DescribeDataExportPreCheckResultResponse.Success"));

		PreCheckResult preCheckResult = new PreCheckResult();
		preCheckResult.setPreCheckName(_ctx.stringValue("DescribeDataExportPreCheckResultResponse.PreCheckResult.PreCheckName"));
		preCheckResult.setState(_ctx.stringValue("DescribeDataExportPreCheckResultResponse.PreCheckResult.State"));

		List<SubCheckItemsItem> subCheckItems = new ArrayList<SubCheckItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataExportPreCheckResultResponse.PreCheckResult.SubCheckItems.Length"); i++) {
			SubCheckItemsItem subCheckItemsItem = new SubCheckItemsItem();
			subCheckItemsItem.setPreCheckItemName(_ctx.stringValue("DescribeDataExportPreCheckResultResponse.PreCheckResult.SubCheckItems["+ i +"].PreCheckItemName"));
			subCheckItemsItem.setState(_ctx.stringValue("DescribeDataExportPreCheckResultResponse.PreCheckResult.SubCheckItems["+ i +"].State"));
			subCheckItemsItem.setErrorMsgCode(_ctx.stringValue("DescribeDataExportPreCheckResultResponse.PreCheckResult.SubCheckItems["+ i +"].ErrorMsgCode"));

			List<String> errorMsgParams = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDataExportPreCheckResultResponse.PreCheckResult.SubCheckItems["+ i +"].ErrorMsgParams.Length"); j++) {
				errorMsgParams.add(_ctx.stringValue("DescribeDataExportPreCheckResultResponse.PreCheckResult.SubCheckItems["+ i +"].ErrorMsgParams["+ j +"]"));
			}
			subCheckItemsItem.setErrorMsgParams(errorMsgParams);

			subCheckItems.add(subCheckItemsItem);
		}
		preCheckResult.setSubCheckItems(subCheckItems);
		describeDataExportPreCheckResultResponse.setPreCheckResult(preCheckResult);
	 
	 	return describeDataExportPreCheckResultResponse;
	}
}