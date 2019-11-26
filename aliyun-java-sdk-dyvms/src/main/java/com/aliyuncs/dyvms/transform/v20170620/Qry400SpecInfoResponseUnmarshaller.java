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

package com.aliyuncs.dyvms.transform.v20170620;

import com.aliyuncs.dyvms.model.v20170620.Qry400SpecInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class Qry400SpecInfoResponseUnmarshaller {

	public static Qry400SpecInfoResponse unmarshall(Qry400SpecInfoResponse qry400SpecInfoResponse, UnmarshallerContext _ctx) {
		
		qry400SpecInfoResponse.setRequestId(_ctx.stringValue("Qry400SpecInfoResponse.RequestId"));
		qry400SpecInfoResponse.setCode(_ctx.stringValue("Qry400SpecInfoResponse.code"));
		qry400SpecInfoResponse.setData(_ctx.stringValue("Qry400SpecInfoResponse.data"));
	 
	 	return qry400SpecInfoResponse;
	}
}