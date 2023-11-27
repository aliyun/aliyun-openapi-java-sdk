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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.GetBucketLifecycleResponse;
import com.aliyuncs.ens.model.v20171110.GetBucketLifecycleResponse.RuleItem;
import com.aliyuncs.ens.model.v20171110.GetBucketLifecycleResponse.RuleItem.Expiration;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBucketLifecycleResponseUnmarshaller {

	public static GetBucketLifecycleResponse unmarshall(GetBucketLifecycleResponse getBucketLifecycleResponse, UnmarshallerContext _ctx) {
		
		getBucketLifecycleResponse.setRequestId(_ctx.stringValue("GetBucketLifecycleResponse.RequestId"));

		List<RuleItem> rule = new ArrayList<RuleItem>();
		for (int i = 0; i < _ctx.lengthValue("GetBucketLifecycleResponse.Rule.Length"); i++) {
			RuleItem ruleItem = new RuleItem();
			ruleItem.setID(_ctx.stringValue("GetBucketLifecycleResponse.Rule["+ i +"].ID"));
			ruleItem.setPrefix(_ctx.stringValue("GetBucketLifecycleResponse.Rule["+ i +"].Prefix"));
			ruleItem.setStatus(_ctx.stringValue("GetBucketLifecycleResponse.Rule["+ i +"].Status"));

			Expiration expiration = new Expiration();
			expiration.setDays(_ctx.stringValue("GetBucketLifecycleResponse.Rule["+ i +"].Expiration.Days"));
			expiration.setCreatedBeforeDate(_ctx.stringValue("GetBucketLifecycleResponse.Rule["+ i +"].Expiration.CreatedBeforeDate"));
			ruleItem.setExpiration(expiration);

			rule.add(ruleItem);
		}
		getBucketLifecycleResponse.setRule(rule);
	 
	 	return getBucketLifecycleResponse;
	}
}