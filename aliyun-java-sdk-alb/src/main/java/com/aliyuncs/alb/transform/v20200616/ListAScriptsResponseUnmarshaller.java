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

package com.aliyuncs.alb.transform.v20200616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alb.model.v20200616.ListAScriptsResponse;
import com.aliyuncs.alb.model.v20200616.ListAScriptsResponse.AScript;
import com.aliyuncs.alb.model.v20200616.ListAScriptsResponse.AScript.ExtAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAScriptsResponseUnmarshaller {

	public static ListAScriptsResponse unmarshall(ListAScriptsResponse listAScriptsResponse, UnmarshallerContext _ctx) {
		
		listAScriptsResponse.setRequestId(_ctx.stringValue("ListAScriptsResponse.RequestId"));
		listAScriptsResponse.setTotalCount(_ctx.integerValue("ListAScriptsResponse.TotalCount"));
		listAScriptsResponse.setNextToken(_ctx.stringValue("ListAScriptsResponse.NextToken"));
		listAScriptsResponse.setMaxResults(_ctx.integerValue("ListAScriptsResponse.MaxResults"));

		List<AScript> aScripts = new ArrayList<AScript>();
		for (int i = 0; i < _ctx.lengthValue("ListAScriptsResponse.AScripts.Length"); i++) {
			AScript aScript = new AScript();
			aScript.setAScriptId(_ctx.stringValue("ListAScriptsResponse.AScripts["+ i +"].AScriptId"));
			aScript.setAScriptName(_ctx.stringValue("ListAScriptsResponse.AScripts["+ i +"].AScriptName"));
			aScript.setPriority(_ctx.longValue("ListAScriptsResponse.AScripts["+ i +"].Priority"));
			aScript.setPosition(_ctx.stringValue("ListAScriptsResponse.AScripts["+ i +"].Position"));
			aScript.setEnabled(_ctx.booleanValue("ListAScriptsResponse.AScripts["+ i +"].Enabled"));
			aScript.setScriptContent(_ctx.stringValue("ListAScriptsResponse.AScripts["+ i +"].ScriptContent"));
			aScript.setAScriptStatus(_ctx.stringValue("ListAScriptsResponse.AScripts["+ i +"].AScriptStatus"));
			aScript.setListenerId(_ctx.stringValue("ListAScriptsResponse.AScripts["+ i +"].ListenerId"));
			aScript.setLoadBalancerId(_ctx.stringValue("ListAScriptsResponse.AScripts["+ i +"].LoadBalancerId"));
			aScript.setExtAttributeEnabled(_ctx.booleanValue("ListAScriptsResponse.AScripts["+ i +"].ExtAttributeEnabled"));

			List<ExtAttribute> extAttributes = new ArrayList<ExtAttribute>();
			for (int j = 0; j < _ctx.lengthValue("ListAScriptsResponse.AScripts["+ i +"].ExtAttributes.Length"); j++) {
				ExtAttribute extAttribute = new ExtAttribute();
				extAttribute.setAttributeKey(_ctx.stringValue("ListAScriptsResponse.AScripts["+ i +"].ExtAttributes["+ j +"].AttributeKey"));
				extAttribute.setAttributeValue(_ctx.stringValue("ListAScriptsResponse.AScripts["+ i +"].ExtAttributes["+ j +"].AttributeValue"));

				extAttributes.add(extAttribute);
			}
			aScript.setExtAttributes(extAttributes);

			aScripts.add(aScript);
		}
		listAScriptsResponse.setAScripts(aScripts);
	 
	 	return listAScriptsResponse;
	}
}