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

package com.aliyuncs.ft.transform.v20180713;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ft.model.v20180713.BatchAuditTest01Response;
import com.aliyuncs.ft.model.v20180713.BatchAuditTest01Response.Demo01;
import com.aliyuncs.ft.model.v20180713.BatchAuditTest01Response.Demo01.Demo011Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchAuditTest01ResponseUnmarshaller {

	public static BatchAuditTest01Response unmarshall(BatchAuditTest01Response batchAuditTest01Response, UnmarshallerContext _ctx) {
		
		batchAuditTest01Response.setRequestId(_ctx.stringValue("BatchAuditTest01Response.RequestId"));
		batchAuditTest01Response.setName(_ctx.stringValue("BatchAuditTest01Response.Name"));

		Demo01 demo01 = new Demo01();

		List<Demo011Item> demo011 = new ArrayList<Demo011Item>();
		for (int i = 0; i < _ctx.lengthValue("BatchAuditTest01Response.Demo01.Demo011.Length"); i++) {
			Demo011Item demo011Item = new Demo011Item();
			demo011Item.setDemo0111(_ctx.stringValue("BatchAuditTest01Response.Demo01.Demo011["+ i +"].Demo0111"));

			demo011.add(demo011Item);
		}
		demo01.setDemo011(demo011);
		batchAuditTest01Response.setDemo01(demo01);
	 
	 	return batchAuditTest01Response;
	}
}