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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListBeebotIntentLgfResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListBeebotIntentLgfResponse.Lgf;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBeebotIntentLgfResponseUnmarshaller {

	public static ListBeebotIntentLgfResponse unmarshall(ListBeebotIntentLgfResponse listBeebotIntentLgfResponse, UnmarshallerContext _ctx) {
		
		listBeebotIntentLgfResponse.setRequestId(_ctx.stringValue("ListBeebotIntentLgfResponse.RequestId"));
		listBeebotIntentLgfResponse.setHttpStatusCode(_ctx.integerValue("ListBeebotIntentLgfResponse.HttpStatusCode"));
		listBeebotIntentLgfResponse.setSuccess(_ctx.booleanValue("ListBeebotIntentLgfResponse.Success"));
		listBeebotIntentLgfResponse.setBeebotRequestId(_ctx.stringValue("ListBeebotIntentLgfResponse.BeebotRequestId"));
		listBeebotIntentLgfResponse.setCode(_ctx.stringValue("ListBeebotIntentLgfResponse.Code"));
		listBeebotIntentLgfResponse.setMessage(_ctx.stringValue("ListBeebotIntentLgfResponse.Message"));
		listBeebotIntentLgfResponse.setPageSize(_ctx.integerValue("ListBeebotIntentLgfResponse.PageSize"));
		listBeebotIntentLgfResponse.setPageNumber(_ctx.integerValue("ListBeebotIntentLgfResponse.PageNumber"));
		listBeebotIntentLgfResponse.setTotalCount(_ctx.integerValue("ListBeebotIntentLgfResponse.TotalCount"));

		List<Lgf> lgfs = new ArrayList<Lgf>();
		for (int i = 0; i < _ctx.lengthValue("ListBeebotIntentLgfResponse.Lgfs.Length"); i++) {
			Lgf lgf = new Lgf();
			lgf.setLgfId(_ctx.longValue("ListBeebotIntentLgfResponse.Lgfs["+ i +"].LgfId"));
			lgf.setCreateTime(_ctx.stringValue("ListBeebotIntentLgfResponse.Lgfs["+ i +"].CreateTime"));
			lgf.setModifyTime(_ctx.stringValue("ListBeebotIntentLgfResponse.Lgfs["+ i +"].ModifyTime"));
			lgf.setRuleText(_ctx.stringValue("ListBeebotIntentLgfResponse.Lgfs["+ i +"].RuleText"));
			lgf.setIntentId(_ctx.longValue("ListBeebotIntentLgfResponse.Lgfs["+ i +"].IntentId"));

			lgfs.add(lgf);
		}
		listBeebotIntentLgfResponse.setLgfs(lgfs);
	 
	 	return listBeebotIntentLgfResponse;
	}
}