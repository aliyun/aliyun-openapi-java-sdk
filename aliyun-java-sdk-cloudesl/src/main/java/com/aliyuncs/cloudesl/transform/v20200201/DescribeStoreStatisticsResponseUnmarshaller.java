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

package com.aliyuncs.cloudesl.transform.v20200201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.DescribeStoreStatisticsResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeStoreStatisticsResponse.StoreStatisticsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStoreStatisticsResponseUnmarshaller {

	public static DescribeStoreStatisticsResponse unmarshall(DescribeStoreStatisticsResponse describeStoreStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeStoreStatisticsResponse.setRequestId(_ctx.stringValue("DescribeStoreStatisticsResponse.RequestId"));
		describeStoreStatisticsResponse.setErrorMessage(_ctx.stringValue("DescribeStoreStatisticsResponse.ErrorMessage"));
		describeStoreStatisticsResponse.setErrorCode(_ctx.stringValue("DescribeStoreStatisticsResponse.ErrorCode"));
		describeStoreStatisticsResponse.setMessage(_ctx.stringValue("DescribeStoreStatisticsResponse.Message"));
		describeStoreStatisticsResponse.setDynamicCode(_ctx.stringValue("DescribeStoreStatisticsResponse.DynamicCode"));
		describeStoreStatisticsResponse.setCode(_ctx.stringValue("DescribeStoreStatisticsResponse.Code"));
		describeStoreStatisticsResponse.setDynamicMessage(_ctx.stringValue("DescribeStoreStatisticsResponse.DynamicMessage"));
		describeStoreStatisticsResponse.setSuccess(_ctx.booleanValue("DescribeStoreStatisticsResponse.Success"));

		List<StoreStatisticsInfo> storeStatisticsInfoList = new ArrayList<StoreStatisticsInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStoreStatisticsResponse.StoreStatisticsInfoList.Length"); i++) {
			StoreStatisticsInfo storeStatisticsInfo = new StoreStatisticsInfo();
			storeStatisticsInfo.setSendFailEsl(_ctx.integerValue("DescribeStoreStatisticsResponse.StoreStatisticsInfoList["+ i +"].SendFailEsl"));
			storeStatisticsInfo.setDisplayFailEsl(_ctx.integerValue("DescribeStoreStatisticsResponse.StoreStatisticsInfoList["+ i +"].DisplayFailEsl"));
			storeStatisticsInfo.setStoreName(_ctx.stringValue("DescribeStoreStatisticsResponse.StoreStatisticsInfoList["+ i +"].StoreName"));
			storeStatisticsInfo.setActiveApDevice(_ctx.integerValue("DescribeStoreStatisticsResponse.StoreStatisticsInfoList["+ i +"].ActiveApDevice"));
			storeStatisticsInfo.setUpdateFailureEsl(_ctx.integerValue("DescribeStoreStatisticsResponse.StoreStatisticsInfoList["+ i +"].UpdateFailureEsl"));
			storeStatisticsInfo.setUpdateEsl(_ctx.integerValue("DescribeStoreStatisticsResponse.StoreStatisticsInfoList["+ i +"].UpdateEsl"));
			storeStatisticsInfo.setOfflineEslDevice(_ctx.integerValue("DescribeStoreStatisticsResponse.StoreStatisticsInfoList["+ i +"].OfflineEslDevice"));
			storeStatisticsInfo.setStatisticsTime(_ctx.stringValue("DescribeStoreStatisticsResponse.StoreStatisticsInfoList["+ i +"].StatisticsTime"));
			storeStatisticsInfo.setStoreId(_ctx.stringValue("DescribeStoreStatisticsResponse.StoreStatisticsInfoList["+ i +"].StoreId"));
			storeStatisticsInfo.setBindEsl(_ctx.integerValue("DescribeStoreStatisticsResponse.StoreStatisticsInfoList["+ i +"].BindEsl"));
			storeStatisticsInfo.setAbnormalEsl(_ctx.integerValue("DescribeStoreStatisticsResponse.StoreStatisticsInfoList["+ i +"].AbnormalEsl"));
			storeStatisticsInfo.setLowBatteryEsl(_ctx.integerValue("DescribeStoreStatisticsResponse.StoreStatisticsInfoList["+ i +"].LowBatteryEsl"));
			storeStatisticsInfo.setBindItem(_ctx.integerValue("DescribeStoreStatisticsResponse.StoreStatisticsInfoList["+ i +"].BindItem"));

			storeStatisticsInfoList.add(storeStatisticsInfo);
		}
		describeStoreStatisticsResponse.setStoreStatisticsInfoList(storeStatisticsInfoList);
	 
	 	return describeStoreStatisticsResponse;
	}
}