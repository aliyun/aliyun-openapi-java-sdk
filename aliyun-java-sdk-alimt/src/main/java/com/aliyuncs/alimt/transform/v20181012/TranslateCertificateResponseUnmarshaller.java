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

package com.aliyuncs.alimt.transform.v20181012;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alimt.model.v20181012.TranslateCertificateResponse;
import com.aliyuncs.alimt.model.v20181012.TranslateCertificateResponse.Data;
import com.aliyuncs.alimt.model.v20181012.TranslateCertificateResponse.Data.CertificateTranslateItemDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class TranslateCertificateResponseUnmarshaller {

	public static TranslateCertificateResponse unmarshall(TranslateCertificateResponse translateCertificateResponse, UnmarshallerContext _ctx) {
		
		translateCertificateResponse.setRequestId(_ctx.stringValue("TranslateCertificateResponse.RequestId"));

		Data data = new Data();

		List<CertificateTranslateItemDTO> translatedValues = new ArrayList<CertificateTranslateItemDTO>();
		for (int i = 0; i < _ctx.lengthValue("TranslateCertificateResponse.Data.TranslatedValues.Length"); i++) {
			CertificateTranslateItemDTO certificateTranslateItemDTO = new CertificateTranslateItemDTO();
			certificateTranslateItemDTO.setKey(_ctx.stringValue("TranslateCertificateResponse.Data.TranslatedValues["+ i +"].Key"));
			certificateTranslateItemDTO.setValue(_ctx.stringValue("TranslateCertificateResponse.Data.TranslatedValues["+ i +"].Value"));
			certificateTranslateItemDTO.setValueTranslation(_ctx.stringValue("TranslateCertificateResponse.Data.TranslatedValues["+ i +"].ValueTranslation"));
			certificateTranslateItemDTO.setKeyTranslation(_ctx.stringValue("TranslateCertificateResponse.Data.TranslatedValues["+ i +"].KeyTranslation"));

			translatedValues.add(certificateTranslateItemDTO);
		}
		data.setTranslatedValues(translatedValues);
		translateCertificateResponse.setData(data);
	 
	 	return translateCertificateResponse;
	}
}