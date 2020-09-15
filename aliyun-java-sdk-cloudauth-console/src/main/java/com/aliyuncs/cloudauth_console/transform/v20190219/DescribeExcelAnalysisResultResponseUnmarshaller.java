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

package com.aliyuncs.cloudauth_console.transform.v20190219;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth_console.model.v20190219.DescribeExcelAnalysisResultResponse;
import com.aliyuncs.cloudauth_console.model.v20190219.DescribeExcelAnalysisResultResponse.ExcelResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExcelAnalysisResultResponseUnmarshaller {

	public static DescribeExcelAnalysisResultResponse unmarshall(DescribeExcelAnalysisResultResponse describeExcelAnalysisResultResponse, UnmarshallerContext _ctx) {
		
		describeExcelAnalysisResultResponse.setRequestId(_ctx.stringValue("DescribeExcelAnalysisResultResponse.RequestId"));
		describeExcelAnalysisResultResponse.setSuccess(_ctx.booleanValue("DescribeExcelAnalysisResultResponse.Success"));
		describeExcelAnalysisResultResponse.setHttpStatusCode(_ctx.integerValue("DescribeExcelAnalysisResultResponse.HttpStatusCode"));

		ExcelResult excelResult = new ExcelResult();
		excelResult.setTotal(_ctx.integerValue("DescribeExcelAnalysisResultResponse.ExcelResult.Total"));
		excelResult.setUpdateCount(_ctx.integerValue("DescribeExcelAnalysisResultResponse.ExcelResult.UpdateCount"));
		excelResult.setInsertCount(_ctx.integerValue("DescribeExcelAnalysisResultResponse.ExcelResult.InsertCount"));
		excelResult.setErrorCount(_ctx.integerValue("DescribeExcelAnalysisResultResponse.ExcelResult.ErrorCount"));

		List<String> errorLine = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExcelAnalysisResultResponse.ExcelResult.ErrorLine.Length"); i++) {
			errorLine.add(_ctx.stringValue("DescribeExcelAnalysisResultResponse.ExcelResult.ErrorLine["+ i +"]"));
		}
		excelResult.setErrorLine(errorLine);
		describeExcelAnalysisResultResponse.setExcelResult(excelResult);
	 
	 	return describeExcelAnalysisResultResponse;
	}
}