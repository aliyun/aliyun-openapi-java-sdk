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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribePdnsAppKeysResponse;
import com.aliyuncs.alidns.model.v20150109.DescribePdnsAppKeysResponse.AppKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePdnsAppKeysResponseUnmarshaller {

	public static DescribePdnsAppKeysResponse unmarshall(DescribePdnsAppKeysResponse describePdnsAppKeysResponse, UnmarshallerContext _ctx) {
		
		describePdnsAppKeysResponse.setRequestId(_ctx.stringValue("DescribePdnsAppKeysResponse.RequestId"));

		List<AppKey> appKeys = new ArrayList<AppKey>();
		for (int i = 0; i < _ctx.lengthValue("DescribePdnsAppKeysResponse.AppKeys.Length"); i++) {
			AppKey appKey = new AppKey();
			appKey.setState(_ctx.stringValue("DescribePdnsAppKeysResponse.AppKeys["+ i +"].State"));
			appKey.setAppKeyId(_ctx.stringValue("DescribePdnsAppKeysResponse.AppKeys["+ i +"].AppKeyId"));
			appKey.setCreateDate(_ctx.stringValue("DescribePdnsAppKeysResponse.AppKeys["+ i +"].CreateDate"));

			appKeys.add(appKey);
		}
		describePdnsAppKeysResponse.setAppKeys(appKeys);
	 
	 	return describePdnsAppKeysResponse;
	}
}