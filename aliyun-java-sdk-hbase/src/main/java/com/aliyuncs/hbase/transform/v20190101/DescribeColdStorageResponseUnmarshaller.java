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

package com.aliyuncs.hbase.transform.v20190101;

import com.aliyuncs.hbase.model.v20190101.DescribeColdStorageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeColdStorageResponseUnmarshaller {

	public static DescribeColdStorageResponse unmarshall(DescribeColdStorageResponse describeColdStorageResponse, UnmarshallerContext _ctx) {
		
		describeColdStorageResponse.setRequestId(_ctx.stringValue("DescribeColdStorageResponse.RequestId"));
		describeColdStorageResponse.setOpenStatus(_ctx.stringValue("DescribeColdStorageResponse.OpenStatus"));
		describeColdStorageResponse.setPayType(_ctx.stringValue("DescribeColdStorageResponse.PayType"));
		describeColdStorageResponse.setColdStorageUsePercent(_ctx.stringValue("DescribeColdStorageResponse.ColdStorageUsePercent"));
		describeColdStorageResponse.setColdStorageUseAmount(_ctx.stringValue("DescribeColdStorageResponse.ColdStorageUseAmount"));
		describeColdStorageResponse.setColdStorageSize(_ctx.stringValue("DescribeColdStorageResponse.ColdStorageSize"));
		describeColdStorageResponse.setColdStorageType(_ctx.stringValue("DescribeColdStorageResponse.ColdStorageType"));
		describeColdStorageResponse.setClusterId(_ctx.stringValue("DescribeColdStorageResponse.ClusterId"));
	 
	 	return describeColdStorageResponse;
	}
}