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

package com.aliyuncs.ivpd.transform.v20190625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ivpd.model.v20190625.RecognizeImageStyleResponse;
import com.aliyuncs.ivpd.model.v20190625.RecognizeImageStyleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeImageStyleResponseUnmarshaller {

	public static RecognizeImageStyleResponse unmarshall(RecognizeImageStyleResponse recognizeImageStyleResponse, UnmarshallerContext _ctx) {
		
		recognizeImageStyleResponse.setRequestId(_ctx.stringValue("RecognizeImageStyleResponse.RequestId"));
		recognizeImageStyleResponse.setCode(_ctx.stringValue("RecognizeImageStyleResponse.Code"));
		recognizeImageStyleResponse.setMessage(_ctx.stringValue("RecognizeImageStyleResponse.Message"));

		Data data = new Data();

		List<String> styles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeImageStyleResponse.Data.Styles.Length"); i++) {
			styles.add(_ctx.stringValue("RecognizeImageStyleResponse.Data.Styles["+ i +"]"));
		}
		data.setStyles(styles);
		recognizeImageStyleResponse.setData(data);
	 
	 	return recognizeImageStyleResponse;
	}
}