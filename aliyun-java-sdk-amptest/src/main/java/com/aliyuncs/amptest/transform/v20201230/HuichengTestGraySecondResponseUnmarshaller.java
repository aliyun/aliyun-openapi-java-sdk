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

package com.aliyuncs.amptest.transform.v20201230;

import com.aliyuncs.amptest.model.v20201230.HuichengTestGraySecondResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class HuichengTestGraySecondResponseUnmarshaller {

	public static HuichengTestGraySecondResponse unmarshall(HuichengTestGraySecondResponse huichengTestGraySecondResponse, UnmarshallerContext _ctx) {
		
		huichengTestGraySecondResponse.setRequestId(_ctx.stringValue("HuichengTestGraySecondResponse.RequestId"));
		huichengTestGraySecondResponse.setSize(_ctx.integerValue("HuichengTestGraySecondResponse.Size"));
		huichengTestGraySecondResponse.setValue(_ctx.stringValue("HuichengTestGraySecondResponse.Value"));
	 
	 	return huichengTestGraySecondResponse;
	}
}