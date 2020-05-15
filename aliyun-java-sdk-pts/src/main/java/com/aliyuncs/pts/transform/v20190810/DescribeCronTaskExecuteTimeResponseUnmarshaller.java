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

package com.aliyuncs.pts.transform.v20190810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20190810.DescribeCronTaskExecuteTimeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCronTaskExecuteTimeResponseUnmarshaller {

	public static DescribeCronTaskExecuteTimeResponse unmarshall(DescribeCronTaskExecuteTimeResponse describeCronTaskExecuteTimeResponse, UnmarshallerContext _ctx) {
		
		describeCronTaskExecuteTimeResponse.setRequestId(_ctx.stringValue("DescribeCronTaskExecuteTimeResponse.RequestId"));
		describeCronTaskExecuteTimeResponse.setCode(_ctx.stringValue("DescribeCronTaskExecuteTimeResponse.Code"));
		describeCronTaskExecuteTimeResponse.setMessage(_ctx.stringValue("DescribeCronTaskExecuteTimeResponse.Message"));
		describeCronTaskExecuteTimeResponse.setHttpStatusCode(_ctx.integerValue("DescribeCronTaskExecuteTimeResponse.HttpStatusCode"));
		describeCronTaskExecuteTimeResponse.setSuccess(_ctx.booleanValue("DescribeCronTaskExecuteTimeResponse.Success"));
		describeCronTaskExecuteTimeResponse.setExpression(_ctx.stringValue("DescribeCronTaskExecuteTimeResponse.Expression"));
		describeCronTaskExecuteTimeResponse.setValid(_ctx.booleanValue("DescribeCronTaskExecuteTimeResponse.Valid"));

		List<Long> timeList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCronTaskExecuteTimeResponse.TimeList.Length"); i++) {
			timeList.add(_ctx.longValue("DescribeCronTaskExecuteTimeResponse.TimeList["+ i +"]"));
		}
		describeCronTaskExecuteTimeResponse.setTimeList(timeList);
	 
	 	return describeCronTaskExecuteTimeResponse;
	}
}