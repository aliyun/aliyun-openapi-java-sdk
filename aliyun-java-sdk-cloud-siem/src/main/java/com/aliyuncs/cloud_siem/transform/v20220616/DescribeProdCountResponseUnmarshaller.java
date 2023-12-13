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

package com.aliyuncs.cloud_siem.transform.v20220616;

import com.aliyuncs.cloud_siem.model.v20220616.DescribeProdCountResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeProdCountResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProdCountResponseUnmarshaller {

	public static DescribeProdCountResponse unmarshall(DescribeProdCountResponse describeProdCountResponse, UnmarshallerContext _ctx) {
		
		describeProdCountResponse.setRequestId(_ctx.stringValue("DescribeProdCountResponse.RequestId"));

		Data data = new Data();
		data.setAliyunProdCount(_ctx.integerValue("DescribeProdCountResponse.Data.AliyunProdCount"));
		data.setHcloudProdCount(_ctx.integerValue("DescribeProdCountResponse.Data.HcloudProdCount"));
		data.setQcloudProdCount(_ctx.integerValue("DescribeProdCountResponse.Data.QcloudProdCount"));
		describeProdCountResponse.setData(data);
	 
	 	return describeProdCountResponse;
	}
}