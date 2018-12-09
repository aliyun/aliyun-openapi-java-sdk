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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryDevicePropertiesDataResponse;
import com.aliyuncs.iot.model.v20180120.QueryDevicePropertiesDataResponse.PropertyDataInfo;
import com.aliyuncs.iot.model.v20180120.QueryDevicePropertiesDataResponse.PropertyDataInfo.PropertyInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDevicePropertiesDataResponseUnmarshaller {

	public static QueryDevicePropertiesDataResponse unmarshall(QueryDevicePropertiesDataResponse queryDevicePropertiesDataResponse, UnmarshallerContext context) {
		
		queryDevicePropertiesDataResponse.setRequestId(context.stringValue("QueryDevicePropertiesDataResponse.RequestId"));
		queryDevicePropertiesDataResponse.setSuccess(context.booleanValue("QueryDevicePropertiesDataResponse.Success"));
		queryDevicePropertiesDataResponse.setCode(context.stringValue("QueryDevicePropertiesDataResponse.Code"));
		queryDevicePropertiesDataResponse.setErrorMessage(context.stringValue("QueryDevicePropertiesDataResponse.ErrorMessage"));
		queryDevicePropertiesDataResponse.setNextValid(context.booleanValue("QueryDevicePropertiesDataResponse.NextValid"));
		queryDevicePropertiesDataResponse.setNextTime(context.longValue("QueryDevicePropertiesDataResponse.NextTime"));

		List<PropertyDataInfo> propertyDataInfos = new ArrayList<PropertyDataInfo>();
		for (int i = 0; i < context.lengthValue("QueryDevicePropertiesDataResponse.PropertyDataInfos.Length"); i++) {
			PropertyDataInfo propertyDataInfo = new PropertyDataInfo();
			propertyDataInfo.setIdentifier(context.stringValue("QueryDevicePropertiesDataResponse.PropertyDataInfos["+ i +"].Identifier"));

			List<PropertyInfo> list = new ArrayList<PropertyInfo>();
			for (int j = 0; j < context.lengthValue("QueryDevicePropertiesDataResponse.PropertyDataInfos["+ i +"].List.Length"); j++) {
				PropertyInfo propertyInfo = new PropertyInfo();
				propertyInfo.setTime(context.longValue("QueryDevicePropertiesDataResponse.PropertyDataInfos["+ i +"].List["+ j +"].Time"));
				propertyInfo.setValue(context.stringValue("QueryDevicePropertiesDataResponse.PropertyDataInfos["+ i +"].List["+ j +"].Value"));

				list.add(propertyInfo);
			}
			propertyDataInfo.setList(list);

			propertyDataInfos.add(propertyDataInfo);
		}
		queryDevicePropertiesDataResponse.setPropertyDataInfos(propertyDataInfos);
	 
	 	return queryDevicePropertiesDataResponse;
	}
}