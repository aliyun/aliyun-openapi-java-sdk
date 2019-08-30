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

import com.aliyuncs.drds.model.v20190123.DescribeDrdsDbRdsNameListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsDbRdsNameListResponseUnmarshaller {

	public static DescribeDrdsDbRdsNameListResponse unmarshall(DescribeDrdsDbRdsNameListResponse describeDrdsDbRdsNameListResponse, UnmarshallerContext _ctx) {
		
		describeDrdsDbRdsNameListResponse.setRequestId(_ctx.stringValue("DescribeDrdsDbRdsNameListResponse.RequestId"));
		describeDrdsDbRdsNameListResponse.setSuccess(_ctx.booleanValue("DescribeDrdsDbRdsNameListResponse.Success"));

		List<String> instanceNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsDbRdsNameListResponse.InstanceNameList.Length"); i++) {
			instanceNameList.add(_ctx.stringValue("DescribeDrdsDbRdsNameListResponse.InstanceNameList["+ i +"]"));
		}
		describeDrdsDbRdsNameListResponse.setInstanceNameList(instanceNameList);
	 
	 	return describeDrdsDbRdsNameListResponse;
	}
}