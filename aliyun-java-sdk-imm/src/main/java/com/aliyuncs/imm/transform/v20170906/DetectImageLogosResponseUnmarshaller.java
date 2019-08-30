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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.DetectImageLogosResponse;
import com.aliyuncs.imm.model.v20170906.DetectImageLogosResponse.LogosItem;
import com.aliyuncs.imm.model.v20170906.DetectImageLogosResponse.LogosItem.LogoBoundary;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectImageLogosResponseUnmarshaller {

	public static DetectImageLogosResponse unmarshall(DetectImageLogosResponse detectImageLogosResponse, UnmarshallerContext _ctx) {
		
		detectImageLogosResponse.setRequestId(_ctx.stringValue("DetectImageLogosResponse.RequestId"));
		detectImageLogosResponse.setImageUri(_ctx.stringValue("DetectImageLogosResponse.ImageUri"));

		List<LogosItem> logos = new ArrayList<LogosItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectImageLogosResponse.Logos.Length"); i++) {
			LogosItem logosItem = new LogosItem();
			logosItem.setLogoName(_ctx.stringValue("DetectImageLogosResponse.Logos["+ i +"].LogoName"));
			logosItem.setLogoConfidence(_ctx.floatValue("DetectImageLogosResponse.Logos["+ i +"].LogoConfidence"));

			LogoBoundary logoBoundary = new LogoBoundary();
			logoBoundary.setWidth(_ctx.integerValue("DetectImageLogosResponse.Logos["+ i +"].LogoBoundary.Width"));
			logoBoundary.setHeight(_ctx.integerValue("DetectImageLogosResponse.Logos["+ i +"].LogoBoundary.Height"));
			logoBoundary.setTop(_ctx.integerValue("DetectImageLogosResponse.Logos["+ i +"].LogoBoundary.Top"));
			logoBoundary.setLeft(_ctx.integerValue("DetectImageLogosResponse.Logos["+ i +"].LogoBoundary.Left"));
			logosItem.setLogoBoundary(logoBoundary);

			logos.add(logosItem);
		}
		detectImageLogosResponse.setLogos(logos);
	 
	 	return detectImageLogosResponse;
	}
}