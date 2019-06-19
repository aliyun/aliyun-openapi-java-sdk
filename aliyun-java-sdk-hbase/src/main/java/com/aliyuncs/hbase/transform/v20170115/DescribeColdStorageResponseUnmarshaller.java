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

package com.aliyuncs.hbase.transform.v20170115;

import com.aliyuncs.hbase.model.v20170115.DescribeColdStorageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeColdStorageResponseUnmarshaller {

	public static DescribeColdStorageResponse unmarshall(DescribeColdStorageResponse describeColdStorageResponse, UnmarshallerContext context) {
		
		describeColdStorageResponse.setRequestId(context.stringValue("DescribeColdStorageResponse.RequestId"));
		describeColdStorageResponse.setClusterId(context.stringValue("DescribeColdStorageResponse.ClusterId"));
		describeColdStorageResponse.setOpenStatus(context.stringValue("DescribeColdStorageResponse.OpenStatus"));
		describeColdStorageResponse.setColdStorageSize(context.stringValue("DescribeColdStorageResponse.ColdStorageSize"));
		describeColdStorageResponse.setColdStorageUsePercent(context.stringValue("DescribeColdStorageResponse.ColdStorageUsePercent"));
		describeColdStorageResponse.setPayType(context.stringValue("DescribeColdStorageResponse.PayType"));
	 
	 	return describeColdStorageResponse;
	}
}